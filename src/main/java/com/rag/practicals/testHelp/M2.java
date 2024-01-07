package com.rag.practicals.testHelp;

public class M2 {
    public void m1(M2 m2){
        System.out.println("hi m1 is called ");
    }
    public void m2(){
        m1(this);
        System.out.println("m2 is called ");
    }
    public static void main(String[] args) {
        M2 m2 = new M2();
        m2.m2();
    }
}
