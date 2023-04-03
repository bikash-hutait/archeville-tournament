package com.example.archery;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Archery Application Test")
public class ArcheryApplicationTests {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("Integration Test#")
    void runTest1(){

        //Arrange
        List<String> arguments= new ArrayList<>(List.of("INPUT_FILE=input.txt"));

        String expectedOutput = "inputfileinput.txt\n"+
        "Gyrhuna János Diák Süsü\n"+
        "Achni Meilong Tianlong\n"+  
        "Bathar Pakhangba Poubi Lai Paphal\n"+
        "János Diák A 1\n"+
        "Süsü B 1\n"+
        "Meilong C 1\n"+
        "Tianlong D 1\n"+
        "Pakhangba E 1\n"+
        "Poubi Lai Paphal F 1\n"+
        "János Diák A 2\n"+
        "Süsü B 2\n"+
        "Meilong C 2\n"+
        "Tianlong D 2\n"+
        "Pakhangba E 2\n"+
        "Poubi Lai Paphal F 2\n"+
        "János Diák A 3\n"+
        "Süsü B 3\n"+
        "Meilong A 3\n"+
        "Tianlong A 3\n"+
        "Pakhangba A 3\n"+
        "Poubi Lai Paphal A 3\n"+
        "János Diák A 4\n"+
        "Süsü A 4\n"+
        "Meilong A 4\n"+
        "Tianlong B 4\n"+
        "Pakhangba A 4\n"+
        "Poubi Lai Paphal A 4\n"+
        "János Diák B 5\n"+
        "Süsü C 5\n"+
        "Meilong A 5\n"+
        "Tianlong B 5\n"+
        "Pakhangba E 5\n"+
        "Poubi Lai Paphal F 5";

        //Act
        ArcheryApplication.run(arguments);

        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
 
	}

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
