
package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Heart {
    
    public Heart()
    {
        System.out.println("Heart is pumping");
    }

    
    private String Animal;
    private int NoofHeart;
    
    @Autowired
    @Qualifier("OctHeart")
    public void setAnimal(String animal) {
        Animal = animal;
    }

    public void setNoofHeart(int noofHeart) {
        NoofHeart = noofHeart;
    }

    public void show()
    {
        System.out.println("Animal is : " + Animal);
        System.out.println("Number of hearts are : " + NoofHeart);
    }
}
