package com.synchroniesTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchroniedToLock {
    Lock lock = new ReentrantLock();
    public synchronized void method1(){
        System.out.println("我是Synchronied形式的锁");
    }

    public void method2(){
        lock.lock();
        try{
            System.out.println("我是lock形式的锁。。。");
        }finally{
            lock.unlock();
        }
    }
    public static void main(String[] args){
        SynchroniedToLock lock = new SynchroniedToLock();
        lock.method1();
        lock.method2();
    }
}
