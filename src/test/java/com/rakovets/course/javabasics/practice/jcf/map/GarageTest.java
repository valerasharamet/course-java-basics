package com.rakovets.course.javabasics.practice.jcf.map;

import garage.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GarageTest {

    @Test
    public void parkTest() {
        Garage garage = new Garage();
        garage.park(new Sedan("Volvo","s60","Blue",2005,"001"));
        garage.park(new HatchBack("BMW","m1","Black",2014,"015"));
        garage.park(new Minivan("Dodge","Caravan","Black",2000,"017"));
        garage.park(new Sedan("BMW","m5","Red",2009,"000"));
        Assertions.assertEquals(1,garage.getCount("BMW", "m1"));
        garage.park(new Sedan("BMW","m5","Red",2001,"007"));
        Assertions.assertEquals(2,garage.getCount("BMW","m5"));
        HatchBack bmwm1 = new HatchBack("BMW","m1","Black",2015,"014");
        garage.park(bmwm1);
        Assertions.assertEquals(2,garage.getCount("BMW","m1"));
        garage.leave(bmwm1);
        Assertions.assertEquals(1,garage.getCount("BMW","m1"));
        Assertions.assertEquals(true,garage.isExist("001"));
        Assertions.assertEquals(false,garage.isExist("013bb"));
        Assertions.assertEquals(true,garage.isExist("Dodge","Caravan","017"));
        Assertions.assertEquals(false,garage.isExist("Dodge","Caravan","017ab"));
        Coupe coupe = new Coupe("Honda", "Civic","White",1992,"145");
        garage.park(coupe);
        Assertions.assertEquals(coupe,garage.getByRegistrationNumber("145"));
        Assertions.assertEquals(null,garage.getByRegistrationNumber("asdw"));


    }
}
