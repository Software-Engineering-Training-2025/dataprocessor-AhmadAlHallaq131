package org.example.dataprocessor.operations.cleaning;

import java.util.List;

public interface CleaningStrategy {
    public List<Integer> clean(List<Integer> inputList);
}
