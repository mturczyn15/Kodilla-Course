package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String[] args) {

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        try {
            fileReaderWithoutHandling.readFile();
        } catch (FileReaderException e) {
            e.printStackTrace();
        }
    }
}
