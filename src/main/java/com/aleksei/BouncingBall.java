package com.aleksei;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        // Check if the conditions are met
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int count = 0;
        // Count each time the ball can be seen (falls above the window)
        while (h > window) {
            count++;
            h *= bounce;

            // Check if the ball can still bounce above the window
            if (h > window) {
                count++; // Count the bounce
            }
        }

        return count;
    }
}
