package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BirdUtilsTest {
    @Test
    void shouldSongOfCuckoo() {
        //given
        String actual = "ку-ку";
        String expected = "ку-ку";

        //when
        BirdUtils.songOfCuckoo();

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldSongOfNightingale() {
        //given
        String actual = "чик-чирик";
        String expected = "чик-чирик";

        //when
        BirdUtils.songOfNightingale();

        //then
        assertThat(actual).isEqualTo(expected);
    }
}