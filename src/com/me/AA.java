package com.me;

//note public class to access it in BB
public class AA {

    //note method here is private
    protected void display() {

        System.out.println("me package, Class AA, protected void display " +
                "method called through a new object of BB");

    }

}
