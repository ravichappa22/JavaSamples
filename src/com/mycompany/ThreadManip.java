package com.mycompany;

public class ThreadManip extends Thread{
    @Override
    public void run() {
        LocalVariable localVariable = new LocalVariable();
        System.out.println(localVariable.setVarable());
    }

    public static void main(String args[]) {
        while(true) {
            ThreadManip threadManip = new ThreadManip();
            threadManip.start();
        }
    }
}

