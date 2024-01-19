package org.example;

import org.apache.commons.lang3.RandomUtils;

public class BirdUtils {
    public static void songOfCuckoo() {
        for (int j = 0; j < RandomUtils.nextInt(0, 100); j++) {
            System.out.println("ку-ку");
        }
    }

    public static void songOfNightingale() {
        for (int j = 0; j < RandomUtils.nextInt(0, 100); j++) {
            System.out.println("чик-чирик");
        }
    }
}

