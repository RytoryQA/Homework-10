package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseNextChannel() {
        Radio radio = new Radio();
        radio.setChannel(1);

        radio.increaseChannel();

        int expected = 2;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchChannelToZero() {
        Radio radio = new Radio();
        radio.setChannel(9);

        radio.increaseChannel();

        int expected = 0;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEnterNumberChannel() {
        Radio radio = new Radio();
        radio.setChannel(5);

        int expected = 5;
        int actual = radio.getChannel();
    }


    @Test
    public void shouldLowerPrevChannel() {
        Radio radio = new Radio();
        radio.setChannel(9);

        radio.decreaseChannel();

        int expected = 8;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchChannelToNine() {
        Radio radio = new Radio();
        radio.setChannel(0);

        radio.decreaseChannel();

        int expected = 9;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUp() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifVolumeMaxLeaveUnchanged() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldLowerVolumeDown() {
        Radio radio = new Radio();
        radio.setVolume(42);

        radio.decreaseVolume();

        int expected = 41;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifVolumeMinLeaveUnchanged() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEnterNumberVolume() {
        Radio radio = new Radio();
        radio.setChannel(77);

        int expected = 77;
        int actual = radio.getVolume();
    }


}

