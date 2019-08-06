package com.synchroniesTest;

public class SynchroniedClassStatic4 implements Runnable {
    static SynchroniedClassStatic4 instance1 = new SynchroniedClassStatic4();
    static SynchroniedClassStatic4 instance2 = new SynchroniedClassStatic4();
    @Override
    public void run() {
        try {
            method();
        }catch(Exception e){
        }
    }
    public static synchronized void method() throws Exception{
        System.out.println("我是类锁的第一种形式，叫做：" + Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive()){
        }
        System.out.println("finished");
    }
}
