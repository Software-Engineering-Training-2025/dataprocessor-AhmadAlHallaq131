package org.example.dataprocessor.factory;

import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.operations.output.ConsoleOutputter;
import org.example.dataprocessor.operations.output.OutputStrategy;
import org.example.dataprocessor.operations.output.TextFileOutputter;

import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputterFactory {

    // to let me overload //
    public static OutputStrategy create(OutputType type) {
        return create(type , Paths.get("target/result.txt"));
    }

    public static OutputStrategy create(OutputType type, Path path) {
        if (type == OutputType.CONSOLE){
            return new ConsoleOutputter();
        } else if (type ==  OutputType.TEXT_FILE) {
            return new TextFileOutputter(path);
        }
        throw new IllegalArgumentException("Unsupported OutputType: " + type);
    }
}
