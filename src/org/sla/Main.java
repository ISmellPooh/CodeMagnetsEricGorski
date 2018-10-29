package org.sla;

public class Main {

    public static void main(String[] args) {

        boolean topHat = true;

        DrumKit d = new DrumKit();

        d.playSnare();

        d.playTopHat();

        if (d.snare == true) {

            d.playSnare();
        }

        d.snare = false;
    }

    void playSnare() {

        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {

        System.out.println("ding ding da-ding");
    }
}
