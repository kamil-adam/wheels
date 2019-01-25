package pl.writeonly.wheels.equals.impl;

import io.vavr.Function2;
import org.junit.Test;
import pl.writeonly.wheels.equals.api.Eqable;

import static com.google.common.truth.Truth.assertThat;

public class GenericEqableTest {

    private static final String SN = "scala-native";
    private static final String SJS = "scala.js";

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

    private static <T extends Eqable<T>> void assertTag(Function2<String, Integer, T > constructor) {

        assertThat(constructor.apply(SN, 12)).isEqualTo(constructor.apply(SN, 12));
        assertThat(constructor.apply(SN, 12)).isNotEqualTo(constructor.apply(SN, 13));
        assertThat(constructor.apply(SN, 12)).isNotEqualTo(constructor.apply(SJS, 12));

        assertThat(constructor.apply(SN, 12).eq(constructor.apply(SN, 12))).isTrue();
        assertThat(constructor.apply(SN, 12).eq(constructor.apply(SN, 13))).isFalse();
        assertThat(constructor.apply(SN, 12).eq(constructor.apply(SJS, 12))).isFalse();
    }
}
