package com.synchroniesTest;

public class SynchroniedException implements Runnable {
    static SynchroniedException instance = new SynchroniedException();
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Thread-0")){
            method1();
        }else{
            method2();
        }
    }
    public synchronized void method1(){
        System.out.println("我是方法锁的方法。我叫：" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
            throw new Exception();
        }catch(Exception e){
            e.getStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "结束");
    }
    public synchronized void method2(){
        System.out.println("我是方法2方法。我叫：" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch(Exception e){

        }
        System.out.println(Thread.currentThread().getName()+ "结束");
    }
}
