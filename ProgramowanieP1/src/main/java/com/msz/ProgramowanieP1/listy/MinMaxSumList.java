package com.msz.ProgramowanieP1.listy;

public class MinMaxSumList {
    private int suma;//sa private dostep bedzie tylko przez gettery isettery
    private int max;
    private int min;

    public MinMaxSumList(int suma, int max, int min) {
        this.suma = suma;
        this.max = max;
        this.min = min;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
