package com.rakovets.course.practice.solid.d;

import java.io.File;

public class PdfReportGenerator implements Generator {
    public File generate(String accountId) {
        //TODO generate PDF
        return new File("order.pdf");
    }
}
