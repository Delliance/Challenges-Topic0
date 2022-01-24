package com.danieltesting.Challenges;

public class MemoryAndProcess {

    private MemorySlot[] memory;
    private String process;

    public MemoryAndProcess(MemorySlot[] memory, String process){

        this.memory=memory;
        this.process=process;

    }

    public MemorySlot[] getMemory() {
        return memory;
    }

    public String getProcess() {
        return process;
    }
}
