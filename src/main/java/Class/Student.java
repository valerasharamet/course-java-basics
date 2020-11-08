package Class;

public class Student {
    String firstName;
    String sureName;
    double averageAnnualMark;
    int age;
    public Student (String firstName, String sureName, double averageAnnualMark, int age) {
        this.firstName= firstName;
        this.sureName = sureName;
        this.averageAnnualMark = averageAnnualMark;
        this.age = age;
    }

    public String getFirstName () {
        return  firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public int getAge() {
        return age;
    }
}
