package com.yang.thread.chapter17;

public interface Lock {

    void lock() throws InterruptedException;


    void unlock();


}
