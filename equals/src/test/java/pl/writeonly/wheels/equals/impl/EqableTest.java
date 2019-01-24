package pl.writeonly.wheels.equals.impl;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class EqableTest {

    public static final String SN = "scala-native";
    public static final String SJS = "scala.js";

    @Test
    public void testBoilerplateTag() {
        assertThat(new BoilerplateTag(SN, 12)).isEqualTo(new BoilerplateTag(SN, 12));
        assertThat(new BoilerplateTag(SN, 12)).isNotEqualTo(new BoilerplateTag(SN, 13));
        assertThat(new BoilerplateTag(SN, 12)).isNotEqualTo(new BoilerplateTag(SJS, 12));

        assertThat(new BoilerplateTag(SN, 12).eq(new BoilerplateTag(SN, 12))).isTrue();
        assertThat(new BoilerplateTag(SN, 12).eq(new BoilerplateTag(SN, 13))).isFalse();
        assertThat(new BoilerplateTag(SN, 12).eq(new BoilerplateTag(SJS, 12))).isFalse();
    }

    @Test
    public void testLombokTag() {
        assertThat(new LombokTag(SN, 12)).isEqualTo(new LombokTag(SN, 12));
        assertThat(new LombokTag(SN, 12)).isNotEqualTo(new LombokTag(SN, 13));
        assertThat(new LombokTag(SN, 12)).isNotEqualTo(new LombokTag(SJS, 12));

        assertThat(new LombokTag(SN, 12).eq(new LombokTag(SN, 12))).isTrue();
        assertThat(new LombokTag(SN, 12).eq(new LombokTag(SN, 13))).isFalse();
        assertThat(new LombokTag(SN, 12).eq(new LombokTag(SJS, 12))).isFalse();
    }

    @Test
    public void crossTest() {
        assertThat(new BoilerplateTag(SN, 12)).isNotEqualTo(new LombokTag(SN, 12));

        assertThat(new BoilerplateTag(SN, 12).equals(new LombokTag(SN, 12))).isFalse();
        assertThat(new LombokTag(SN, 12).equals(new BoilerplateTag(SN, 12))).isFalse();

//        assertThat(new BoilerplateTag(SN, 12).eq(new LombokTag(SN, 12))).isFalse();
//        assertThat(new LombokTag(SN, 12).eq(new BoilerplateTag(SN, 12))).isFalse();
    }
}
