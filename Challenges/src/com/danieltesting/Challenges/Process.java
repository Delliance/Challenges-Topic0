package com.danieltesting.Challenges;

public abstract class Process {

    //Here this means that other class can have processes only the ones that implement this method
    String processChar;
    int minSize;
    int maxSize;

    public String getProcessChar() {
        return processChar;
    }

    public void setProcessChar(String processChar) {
        this.processChar = processChar;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
