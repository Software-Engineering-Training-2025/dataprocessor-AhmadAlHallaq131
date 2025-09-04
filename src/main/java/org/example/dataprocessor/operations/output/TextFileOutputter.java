package org.example.dataprocessor.operations.output;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TextFileOutputter implements OutputStrategy{

    private final Path outputPath;
    public TextFileOutputter(Path outputPath) {
        this.outputPath = outputPath;
    }
    @Override
    public void output(String theMessage) throws Exception {
        Path parent = outputPath.getParent();
        if (parent != null && !Files.exists(parent)) {
            Files.createDirectories(parent);
        }

        if (Files.exists(outputPath)) {
            Files.writeString(outputPath, theMessage + System.lineSeparator(), StandardOpenOption.APPEND);
        } else {
            Files.writeString(outputPath, theMessage + System.lineSeparator(), StandardOpenOption.CREATE);
        }
    }
}
