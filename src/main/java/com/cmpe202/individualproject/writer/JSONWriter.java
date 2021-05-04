package com.cmpe202.individualproject.writer;

import com.cmpe202.individualproject.handlers.CreditCardHandler;
import com.cmpe202.individualproject.handlers.MasterCard;
import com.cmpe202.individualproject.main.CreditCardEntry;
import com.cmpe202.individualproject.main.OutputEntry;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONWriter implements Writer{
    File outputFile;

    public JSONWriter() {
    }

    @Override

    public void writeToFile(List<OutputEntry> result, String outputFile) {
        FileWriter fileWriter ;
        try {
            fileWriter = new FileWriter(outputFile);
            fileWriter.write("[");
           // fileWriter.write('\n');
            for (OutputEntry each : result) {
                fileWriter.write("\n");
                fileWriter.write("{");
                fileWriter.write('\n');
                fileWriter.write("\"Card Number\": " + each.getCardNumber() + ",");
                fileWriter.write('\n');
                fileWriter.write("\"Card Type\": " + "\"" + each.getType() + "\"" + " ,");
                fileWriter.write('\n');
                fileWriter.write("}");
            }

            fileWriter.write("\n");
            fileWriter.write("]");
            fileWriter.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
