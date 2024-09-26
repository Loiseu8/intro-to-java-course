package com.cbfacademy;

public class MyCharacterCopier {

    private final Source mySource;
    private final Destination myDestination;

    public MyCharacterCopier(Source mySource, Destination myDestination) {
        this.mySource = mySource;
        this.myDestination = myDestination;
    }

    public void copy() {
        char c;
        while ((c = mySource.getChar()) != '\n') {
            myDestination.setChar(c);
        }
    }
}
