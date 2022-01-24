package com.danieltesting.Challenges;

public class ButtonDelete implements Buttons {


    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public char command() {
        return 'd';
    }

    @Override
    public MemorySlot [] feature(MemoryAndProcess memoryAndProcess) {

        MemorySlot [] memory = memoryAndProcess.getMemory();
        String value = String.format("%03d", Integer.parseInt(memoryAndProcess.getProcess()));

        // this here deletes all spaces that contains the ID introduced by the user
        for (int i = 0; i < memory.length-1; i++) {

            if (memory [i].getId().equals(value)){
                memory [i] = new MemorySlot("****", "");
            }

        }

        int counter = 0;

        for (int i = 0; i < memory.length-1; i++) {

            if (!(memory[i].getProcess().equals("****"))){

                memory[counter++]=memory[i];

            }
            
        }
        while (counter < memory.length){
            memory[counter++] = new MemorySlot("****","");
        }

        return memory;

    }
}
