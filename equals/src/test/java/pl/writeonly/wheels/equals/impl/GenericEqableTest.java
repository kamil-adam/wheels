package pl.writeonly.wheels.equals.impl;

import io.vavr.Function2;
import org.junit.Test;
import pl.writeonly.wheels.equals.api.Eqable;

import static com.google.common.truth.Truth.assertThat;

public class GenericEqableTest {

    private static final String SN = "scala-native";
    private static final String SJS = "scala.js";

    private static <T extends Eqable<T>> void assertTag(Function2<String, Integer, T> constructor) {

        assertThat(constructor.apply(SN, 12)).isEqualTo(constructor.apply(SN, 12));
        assertThat(constructor.apply(SN, 12)).isNotEqualTo(constructor.apply(SN, 13));
        assertThat(constructor.apply(SN, 12)).isNotEqualTo(constructor.apply(SJS, 12));

        assertThat(constructor.apply(SN, 12).eq(constructor.apply(SN, 12))).isTrue();
        assertThat(constructor.apply(SN, 12).eq(constructor.apply(SN, 13))).isFalse();
        assertThat(constructor.apply(SN, 12).eq(constructor.apply(SJS, 12))).isFalse();
    }

    private static <T1, T2> void crossTests(T1 tag1, T2 tag2) {
        assertThat(tag1).isNotEqualTo(tag2);
        assertThat(tag2).isNotEqualTo(tag1);

        assertThat(tag1.equals(tag2)).isFalse();
        assertThat(tag2.equals(tag1)).isFalse();
    }

    @Test
    public void testBaroqueTag() {
        assertTag(BaroqueTag::new);
    }

    @Test
    public void testGuavaTag() {
        assertTag(GuavaTag::new);
    }

    @Test
    public void testLombokTag() {
        assertTag(LombokTag::new);
    }

    @Test
    public void crossTests() {
        crossTests(new LombokTag(SN, 12), new GuavaTag(SN, 12));
        crossTests(new GuavaTag(SN, 12), new BaroqueTag(SN, 12));
        crossTests(new BaroqueTag(SN, 12), new LombokTag(SN, 12));
    }
}
