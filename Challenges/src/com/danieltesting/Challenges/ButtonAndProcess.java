package com.danieltesting.Challenges;

public class ButtonAndProcess {

    private Buttons pushedButton;
    private String process;

    public ButtonAndProcess (Buttons pushedButton, String process){

        this.pushedButton = pushedButton;
        this.process = process;

    }

    public Buttons getPushedButton() {
        return pushedButton;
    }

    public String getProcess() {
        return process;
    }
}
