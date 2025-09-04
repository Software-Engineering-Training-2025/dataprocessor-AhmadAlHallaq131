package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.factory.AnalyzerFactory;
import org.example.dataprocessor.factory.CleanerFactory;
import org.example.dataprocessor.factory.OutputterFactory;
import org.example.dataprocessor.operations.analysis.AnalysisStrategy;
import org.example.dataprocessor.operations.cleaning.CleaningStrategy;
import org.example.dataprocessor.operations.output.OutputStrategy;

import java.util.*;

/**
 * Students ONLY implement the process(...) method below.
 *
 * Requirements:
 * - Order: Clean -> Analyze -> Output -> Return result
 * - Do NOT mutate the original input list
 * - Handle empties as specified in AnalysisType docs
 * - Output format EXACTLY: "Result = <value>"
 * - TEXT_FILE path: target/result.txt (create parent dirs, overwrite file)
 */
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

//        double result = AnalyzerFactory.create(analysisType)
//                .analyze(data);


        // TODO: implement using the enums only (no long if/else ladders required,
        // but minimal branching to select behavior by enum is acceptable in this task).
        // Steps:
        // 1) Copy & clean data according to cleaningType.
        // 2) Analyze cleaned array according to analysisType.
        // 3) Output according to outputType (console or target/result.txt).
        // 4) Return the numeric result.

        return result;
    }
}

