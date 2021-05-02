
package com.cmpe202.individualproject.writer;

import com.cmpe202.individualproject.main.OutputEntry;

import java.util.List;

public interface Writer {

    public void write(List<OutputEntry> result , String outputFile);
}

