package org.example;

import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File xmlFile1 = new File("src/main/resources/employees1.xml");
        File xmlFile2 = new File("src/main/resources/employees2.xml");

        Diff diff = DiffBuilder.compare(xmlFile1).withTest(xmlFile2).build();
        if (diff.hasDifferences()) {
            diff.getDifferences().forEach(System.out::println);
        } else {
            System.out.println("No differences found");
        }
    }
}