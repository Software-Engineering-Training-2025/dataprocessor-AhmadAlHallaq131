package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.factory.AnalyzerFactory;
import org.example.dataprocessor.factory.CleanerFactory;
import org.example.dataprocessor.factory.OutputterFactory;

import java.util.*;

public class DataProcessorService {

    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {
        double result = AnalyzerFactory.create(analysisType)
                .analyze(
                        CleanerFactory.create(cleaningType)
                                .clean(data)
                );
        OutputterFactory.create(outputType)
                .output("Result = " + result);

        return result;
    }
}

