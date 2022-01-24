package com.danieltesting.Challenges;


public class Console {

    private static ButtonAndProcess pushButton (String userInput){

        ButtonAndProcess buttonAndProcess = null;
        // this is to determine the command and the process

        int splitAfter = 1; //This is to split the codes, since they come in 1 letter and the id a single letter or numbers

        String command = userInput.substring(0,splitAfter);
        String process = userInput.substring(splitAfter,userInput.length()); //process is either s or a for create, and a number for delete

        System.out.println("Command :"+command+", Process :"+process);

        switch (command.toLowerCase()){

            case "c":
                buttonAndProcess = new ButtonAndProcess(new ButtonCreate(),process);
                break;

            case "d":
                buttonAndProcess = new ButtonAndProcess(new ButtonDelete(),process);
                break;

            case "p":
                buttonAndProcess = new ButtonAndProcess(new ButtonPrint(),process);
                break;

        }

        return buttonAndProcess;

    }

    private static MemorySlot [] memory = EmptyMemory.emptyMemory();

    private static MemorySlot [] modifyMemory (ButtonAndProcess commandAndProcess){

        //Creating a new memory
        MemoryAndProcess memoryAndProcess = new MemoryAndProcess(memory,commandAndProcess.getProcess());
        memory = commandAndProcess.getPushedButton().feature(memoryAndProcess);

        return memory;

    }

    public static void printOnConsole (String userInput){

        String input = userInput;

        modifyMemory (pushButton(input));

    }

}
