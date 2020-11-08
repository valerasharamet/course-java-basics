package Studio;

public class Actor {
    String firstName;
    String lastName;
    double fee;
    int age;
    public Actor (String firstName, String lastName, double fee, int age) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public double getFee () {
        return fee;
    }

    public int getAge () {
        return age;
    }

}
