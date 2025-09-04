package org.example.dataprocessor.factory;


import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.operations.cleaning.CleaningStrategy;
import org.example.dataprocessor.operations.cleaning.RemoveNegativesCleaner;
import org.example.dataprocessor.operations.cleaning.ReplaceNegativesWithZeroCleaner;


public class CleanerFactory {

    public  CleanerFactory() {
    }

    public static CleaningStrategy create(CleaningType type) {

        if (type == CleaningType.REMOVE_NEGATIVES){
            return new RemoveNegativesCleaner();
        } else if (type == CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            return new ReplaceNegativesWithZeroCleaner();
        }
        throw new IllegalArgumentException("Type not found : " + type);
    }
}
