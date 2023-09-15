package org.example;

public class Radio {

    private int channel;
    private int volume;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {

        if (newChannel < 0) {
            return;
        }
        if (newChannel > 9) {
            return;
        }

        channel = newChannel;
    }

    public void increaseChannel() {
        int next = channel + 1;

        setChannel(next);
        if (next > 9) {
            channel = 0;
        }
    }

    public void decreaseChannel() {
        int prev = channel - 1;
        setChannel(prev);
        if (prev < 0) {
            channel = 9;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        int upVolume = volume + 1;

        setVolume(upVolume);
        if (upVolume > 100) {
            volume = 100;
        }
    }

    public void decreaseVolume() {
        int downVolume = volume - 1;

        setVolume(downVolume);
        if (downVolume < 0) {
            volume = 0;
        }
    }

}
