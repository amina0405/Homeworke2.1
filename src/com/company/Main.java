package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shelter shelter = new Shelter("Ramashka",  Color.BLACK, "Pervemay 13");

        Dog dog = new Dog("Rex", Color.BLACK);

        Dog dog1 = new Dog("Zeus", Color.GREEN);

        System.out.println(shelter.toString());
        System.out.println(dog.toString());
        System.out.println(dog1.toString());
    }
}
