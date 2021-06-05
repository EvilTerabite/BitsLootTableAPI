package me.evilterabite.bitsloottableapi.lib;

import java.util.Random;

public class Bound {
    public static int rand(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }

        return new Random().nextInt(max - min + 1) + min;
    }
}
