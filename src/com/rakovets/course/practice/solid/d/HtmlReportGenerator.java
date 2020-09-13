package com.rakovets.course.practice.solid.d;

import java.io.File;

public class HtmlReportGenerator implements Generator{
    public File generate(String accountId) {
        //TODO generate HTML
        return new File("order.html");
    }
}
