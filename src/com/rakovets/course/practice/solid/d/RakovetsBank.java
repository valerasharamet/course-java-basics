package com.rakovets.course.practice.solid.d;

import java.io.File;

public class RakovetsBank {
    public static void main(String[] args) {
        RakovetsSoftwareBank rakovetsSoftwareBank = new RakovetsSoftwareBank(new HtmlReportGenerator());
        Person stas = new Person("stas", "0");
        File file = rakovetsSoftwareBank.generator.generate(stas.accountId);
        send(file);
    }

    private static void send(File file) {

    }
}
