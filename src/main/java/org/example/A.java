package org.example;

public class A {
    private int a;
    private int b;
    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public int getB(int b) {
        return b;
    }
    public int sum() {
        return a + b;
    }
}
