package com.danieltesting.Challenges;

public class ButtonPrint implements Buttons {


    @Override
    public String name() {
        return "Print";
    }

    @Override
    public char command() {
        return 'p';
    }

    @Override
    public MemorySlot[] feature(MemoryAndProcess memoryAndProcess) {

        MemorySlot [] memory = memoryAndProcess.getMemory();

        for (int i = memory.length-2; i >= 0 ; i--) {

            System.out.print(memory[i].getProcess()+memory[i].getId());

            if ( ((i)%10 == 0) && (i < memory.length) ){
                System.out.print("\n");
            }
            else {
                System.out.print("\t");
            }

        }

        return memory;

    }
}
