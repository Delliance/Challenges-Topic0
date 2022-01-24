package com.danieltesting.Challenges;

public class EmptyMemory {

    public static MemorySlot [] emptyMemory(){

        String process = "****";
        String id = "";

        MemorySlot memorySlot = new MemorySlot(process, id);


        //I don't know why just doing it to 200, later creates an error as if the array was 199 in length
        MemorySlot [] newEmptyMemory = new MemorySlot[201];

        for (int i = 0; i < newEmptyMemory.length-1; i++) {

            newEmptyMemory [i] = memorySlot;

        }

        return newEmptyMemory;

    }

}
