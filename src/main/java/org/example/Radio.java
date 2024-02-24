package org.example;

public class Radio {

    private int allChannel = 10;
    private int minChannel = 0;
    private int maxChannel = allChannel - 1;
    private int channel;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume;

    public int getChannel() {
        return channel;
    }

    public int getAllChannel() {
        return allChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setChannel(int newChannel) {

        if (newChannel < minChannel) {
            return;
        }
        if (newChannel > maxChannel) {
            return;
        }

        this.channel = newChannel;
    }

    public void setAllChannel(int newAllChannel) {
        if (newAllChannel <= minChannel) {
            return;
        }
        this.allChannel = newAllChannel;
    }

    public void setMaxChannel(int newMaxChannel) {
        if (newMaxChannel <= minChannel) {
            return;
        }
        if (newMaxChannel > allChannel) {
            return;
        }
        this.maxChannel = newMaxChannel;
    }


    public Radio(int allChannel) {
        this.allChannel = allChannel;
        this.maxChannel = allChannel - 1;

    }

    public Radio() {
        this.allChannel = 10;
        this.minChannel = 0;
        this.maxChannel = 9;
        this.channel = this.minChannel;
    }

    public void increaseChannel() {
        int next = channel + 1;

        setChannel(next);
        if (next > maxChannel) {
            channel = minChannel;
        }
    }

    public void decreaseChannel() {
        int prev = channel - 1;
        setChannel(prev);
        if (prev < minChannel) {
            channel = maxChannel;
        }
    }

    // дальше про громкость
    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        this.volume = newVolume;
    }

    public void increaseVolume() {
        int upVolume = volume + 1;

        setVolume(upVolume);
        if (upVolume > maxVolume) {
            volume = maxVolume;
        }
    }

    public void decreaseVolume() {
        int downVolume = volume - 1;

        setVolume(downVolume);
        if (downVolume < minVolume) {
            this.volume = minVolume;
        }
    }

}
