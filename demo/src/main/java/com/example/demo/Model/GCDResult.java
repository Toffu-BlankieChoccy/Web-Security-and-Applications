package com.example.demo.Model;

public class GCDResult {
    private long a;
    private long b;
    private long gcd;
    private long x;
    private long y;

    // Getter and setter
    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public long getGcd() {
        return gcd;
    }

    public void setGcd(long gcd) {
        this.gcd = gcd;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    // Constructor
    public GCDResult(long a, long b, long gcd, long x, long y) {
        this.a = a;
        this.b = b;
        this.gcd = gcd;
        this.x = x;
        this.y = y;
    }

}
