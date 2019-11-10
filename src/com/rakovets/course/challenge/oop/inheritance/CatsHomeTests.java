package com.rakovets.course.challenge.oop.inheritance;

public class CatsHomeTests {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.display();
        tom.mew();
        tom.purr();
        tom.setName("Jon");
        System.out.printf("Cat name: %s\n", tom.getName());
        Cat persian = new Persian("Pers");
        persian.display();
        persian.mew();
        persian.purr();
        Cat siamese = new Siamese("Siam");
        siamese.display();
        siamese.mew();
        siamese.purr();
        Cat sphynx = new Sphynx("Sphy");
        sphynx.display();
        sphynx.mew();
        sphynx.purr();

        Person jack = new Person(50);
        jack.display();
        tom.mew(jack);
        jack.display();
        tom.purr(jack);
        tom.purr(jack);
        tom.purr();
        jack.display();

        persian.mew(jack);
        jack.display();
        persian.purr(jack);
        jack.display();

        sphynx.mew(jack);
        jack.display();
        sphynx.purr(jack);
        jack.display();

        siamese.mew(jack);
        jack.display();
        siamese.purr(jack);
        jack.display();

        for (int i = 0; i < 20; i++) {
            siamese.mew(jack);
        }
        jack.display();

        for (int i = 0; i < 40; i++) {
            siamese.purr(jack);
        }
        jack.display();
    }
}
