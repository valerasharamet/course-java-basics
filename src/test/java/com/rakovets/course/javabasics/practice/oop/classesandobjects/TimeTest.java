package com.rakovets.course.javabasics.practice.oop.classesandobjects;
public class TimeTest {
    public static void main(String[] args) {
   //     Scanner scanner = new Scanner(System.in);
     //   int hour = (scanner.nextInt());
       // int minute = scanner.nextInt();
         Time vrema = new Time (6, 21, 36);
         System.out.println(vrema.getHour() + "/" + vrema.getMinute() + "/" + vrema.getSecond());
         vrema.setHour(7);
         vrema.setMinute(9);
         vrema.setSecond(15);
         System.out.println(vrema.getHour() + "/" + vrema.getMinute() + "/" + vrema.getSecond());
         Time sec = new Time(7385);
         System.out.println(sec.getHour() + "/" + sec.getMinute() + "/" + sec.getSecond());
         System.out.println(sec.getTotalSecond());
    }
}
