package org.example.dataprocessor.factory;

import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.operations.analysis.*;

public class AnalyzerFactory {

    public AnalyzerFactory() {
    }

    public static AnalysisStrategy create(AnalysisType type) {

        if (type == AnalysisType.MEAN){
            return new MeanAnalyzer();
        } else if (type == AnalysisType.MEDIAN) {
            return new MedianAnalyzer();
        } else if (type == AnalysisType.STD_DEV) {
            return new StandardDeviationAnalyzer();
        } else if (type == AnalysisType.P90_NEAREST_RANK){
            return new P90NearestRankAnalyzer();
        } else if (type ==  AnalysisType.TOP3_FREQUENT_COUNT_SUM) {
            return new Top3FrequentCountSumAnalyzer();
        }
        throw new IllegalArgumentException("Unknown analysis type : " + type);
    }
}
