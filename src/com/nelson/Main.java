package com.nelson;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("B3760-f.pdf");
        PDDocument document = PDDocument.load(file);
        PDFTextStripper pdf = new PDFTextStripper();
        StringWriter sw = new StringWriter();
        pdf.writeText(document, sw);
        String text = sw.toString();
        System.out.println(text);
    }
}
