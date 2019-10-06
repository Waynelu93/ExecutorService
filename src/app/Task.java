package app;

import java.util.Random;

class Task implements Runnable {
    public void run() {

        System.out.println(Math.random());
    }
}