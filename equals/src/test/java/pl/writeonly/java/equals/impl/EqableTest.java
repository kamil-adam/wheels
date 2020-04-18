package pl.writeonly.java.equals.impl;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class EqableTest {

    private static final String SN = "scala-native";
    private static final String SJS = "scala.js";

    @Test
    public void testBaroqueTag() {
        assertThat(new BaroqueTag(SN, 12)).isEqualTo(new BaroqueTag(SN, 12));
        assertThat(new BaroqueTag(SN, 12)).isNotEqualTo(new BaroqueTag(SN, 13));
        assertThat(new BaroqueTag(SN, 12)).isNotEqualTo(new BaroqueTag(SJS, 12));

        assertThat(new BaroqueTag(SN, 12).eq(new BaroqueTag(SN, 12))).isTrue();
        assertThat(new BaroqueTag(SN, 12).eq(new BaroqueTag(SN, 13))).isFalse();
        assertThat(new BaroqueTag(SN, 12).eq(new BaroqueTag(SJS, 12))).isFalse();
    }

    @Test
    public void testGuavaTag() {
        assertThat(new GuavaTag(SN, 12)).isEqualTo(new GuavaTag(SN, 12));
        assertThat(new GuavaTag(SN, 12)).isNotEqualTo(new GuavaTag(SN, 13));
        assertThat(new GuavaTag(SN, 12)).isNotEqualTo(new GuavaTag(SJS, 12));

        assertThat(new GuavaTag(SN, 12).eq(new GuavaTag(SN, 12))).isTrue();
        assertThat(new GuavaTag(SN, 12).eq(new GuavaTag(SN, 13))).isFalse();
        assertThat(new GuavaTag(SN, 12).eq(new GuavaTag(SJS, 12))).isFalse();
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
        assertThat(new BaroqueTag(SN, 12)).isNotEqualTo(new GuavaTag(SN, 12));
        assertThat(new GuavaTag(SN, 12)).isNotEqualTo(new BaroqueTag(SN, 12));

        assertThat(new BaroqueTag(SN, 12).equals(new GuavaTag(SN, 12))).isFalse();
        assertThat(new GuavaTag(SN, 12).equals(new BaroqueTag(SN, 12))).isFalse();

//        assertThat(new BaroqueTag(SN, 12).eq(new LombokTag(SN, 12))).isFalse();
//        assertThat(new LombokTag(SN, 12).eq(new BaroqueTag(SN, 12))).isFalse();
    }
}
