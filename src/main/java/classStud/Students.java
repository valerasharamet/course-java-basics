package classStud;

public class Students {
   public String firstName;
   public String surName;
   public double averageAnnualMark;
   public int age;
    public Students (String firstName, String surName, double averageAnnualMark, int age) {
        this.firstName= firstName;
        this.surName = surName;
        this.averageAnnualMark = averageAnnualMark;
        this.age = age;
    }

    public String getFirstName () {
        return  firstName;
    }

    public String getSurName() {
        return surName;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public int getAge() {
        return age;
    }
}
