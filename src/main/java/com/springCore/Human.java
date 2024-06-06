package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    @Autowired
    public Heart heart;

    public Human()
    {
        System.out.println("Human is ALive");
    }

    
    // public Human(Heart heart)
    // {
    //     this.heart=heart;
    //     heart.show();
    // }

  
  
}
