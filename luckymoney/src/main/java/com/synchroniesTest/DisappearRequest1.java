package com.synchroniesTest;

public class DisappearRequest1 implements Runnable {
    static DisappearRequest1 instance = new DisappearRequest1();
    static int i = 0;
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
    public synchronized void run(){
        for(int j = 0 ; j< 100000 ; j++){
            i++;
        }
    }
}
