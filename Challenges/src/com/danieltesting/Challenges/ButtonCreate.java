package com.danieltesting.Challenges;

import java.util.Random;

public class ButtonCreate implements Buttons {


    @Override
    public String name() {
        return "Create";
    }

    @Override
    public char command() {
        return 'c';
    }

    @Override
    public MemorySlot [] feature(MemoryAndProcess memoryAndProcess) {

        Process process = null;

        switch (memoryAndProcess.getProcess()){

            case "s":
                process = new ProcessSystem();
                break;

            case "a":
                process = new ProcessApplication();
                break;

            default:
                System.out.println("Not a valid process");
                return memoryAndProcess.getMemory();

        }

        String id = "";
        String processChar = process.processChar;
        int minSize = process.minSize;
        int maxSize = process.maxSize;
        Random randomSize = new Random();
        MemorySlot [] memory = memoryAndProcess.getMemory();

        int memorySize = randomSize.nextInt(maxSize-minSize) + minSize;

        MemorySlot memorySlot;

        int aux2 = 1;

        if (!(memory[0].getProcess().equals("****"))){

            int min = 1; //the minimum should be always 1
            int max = Integer.parseInt(memory[0].getId());

            for (int i = 0; i < memory.length-1; i++) {

                try {
                    max = (Integer.parseInt(memory[i].getId()) > max) ? Integer.parseInt(memory[i].getId()) : max;
                }
                catch (Exception e) {
                    break;
                }

            }

            aux2 = max+1;

        }

        for (int i = 0; i < memory.length-1; i++) {

        }

        int aux = 0;

        //I decided to use this try catch to check if the memory doesn't have more space in this case the array
        //I could also check beforehand if the size was enough, with an if, but I wanted to show the try
        //catch case
        try {

            for (int i = 0; i < (memorySize + aux); i++) {

                if (memory[i].getProcess().equals("****")) {
                    id = String.format("%03d", aux2);
                    memory[i] = new MemorySlot(processChar, id);
                } else {
                    aux++;

                }

            }

        }

        catch (Exception ohNo){
            System.out.println("MemoryOverflowException");
            for (int i = 0; i < memory.length-1; i++) {
                if (Integer.parseInt(memory [i].getId())==aux2){
                    memory [i] = new MemorySlot("****", "");
                }

            }

        }

        return memory;

    }
}
