package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shelter shelter = new Shelter("Sunshine" , Color.BLACK, "Jibek jolu");

        Dog dog = new Dog("Leo" , Color.BLACK);

        Dog dog1 = new Dog("Zeus" , Color.GREEN);

        System.out.println(shelter.info());
        System.out.println(dog.dog());
        System.out.println(dog1.dog());


    }

}