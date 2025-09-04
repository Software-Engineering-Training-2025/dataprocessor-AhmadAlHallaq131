package org.example.dataprocessor.operations.output;

public class ConsoleOutputter implements OutputStrategy{

    @Override
    public void output(String theMessage) throws Exception {
        System.out.println(theMessage);
    }
}
