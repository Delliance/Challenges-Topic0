package com.danieltesting.Challenges;

import org.w3c.dom.Node;

public class MemorySlot {

    private String process = "****";
    private String id = "";

    public MemorySlot (String process, String id){

        this.process = process;
        this.id = id;

    }

    public String getProcess() {
        return process;
    }

    public String getId() {
        return id;
    }

}
