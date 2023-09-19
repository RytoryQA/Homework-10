package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(30);

    @Test
    public void shouldIncreaseNextChannel() {

        radio.setChannel(9);

        radio.increaseChannel();

        int expected = 10;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchChannelToZero() {

        radio.setChannel(29);

        radio.increaseChannel();

        int expected = 0;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEnterNumberChannel() {

        radio.setChannel(5);

        int expected = 5;
        int actual = radio.getChannel();
    }


    @Test
    public void shouldLowerPrevChannel() {

        radio.setChannel(9);

        radio.decreaseChannel();

        int expected = 8;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchChannelToNine() {

        radio.setChannel(0);

        radio.decreaseChannel();

        int expected = 29;
        int actual = radio.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void howManyDefaultMaxChannel() {

        Assertions.assertEquals(29, radio.getMaxChannel());
    }

    @Test
    public void testReturnSetMaxChannelIfNull() {

        radio.setMaxChannel(0);

        Assertions.assertEquals(29, radio.getMaxChannel());
    }

    @Test
    public void testReturnIfMaxChannelAboveAllChannel() {
        radio.setMaxChannel(54);
        Assertions.assertEquals(29, radio.getMaxChannel());
    }

    @Test
    public void testMaxChannelValidValue() {
        radio.setMaxChannel(6);
        Assertions.assertEquals(6, radio.getMaxChannel());
    }

    @Test
    public void TestMinChannel() {
        Assertions.assertEquals(0, radio.getMinChannel());
    }

    @Test
    public void howManyDefaultAllChannel() {
        Assertions.assertEquals(30, radio.getAllChannel());
    }

    @Test
    public void testReturnSetAllChannel() {

        radio.setAllChannel(0);

        Assertions.assertEquals(30, radio.getAllChannel());
    }

    @Test
    public void selectQuantityAllChannel() {

        radio.setAllChannel(45);

        Assertions.assertEquals(45, radio.getAllChannel());

    }

    @Test
    public void testRadio1() {
        Assertions.assertEquals(30, radio.getAllChannel());
    }

    @Test
    public void shouldIncreaseVolumeUp() {

        radio.setVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifVolumeMaxLeaveUnchanged() {

        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinVolume() {
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void testMaxVolume() {

        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldLowerVolumeDown() {

        radio.setVolume(42);

        radio.decreaseVolume();

        int expected = 41;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifVolumeMinLeaveUnchanged() {

        radio.setVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEnterNumberVolume() {

        radio.setVolume(77);

        int expected = 77;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio2() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getAllChannel());
        Assertions.assertEquals(0, radio.getMinChannel());
        Assertions.assertEquals(9, radio.getMaxChannel());
        Assertions.assertEquals(0, radio.getChannel());
    }


}

