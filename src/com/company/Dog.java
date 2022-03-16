package com.company;

public  class Dog extends Pet {



  private Color color;

    public Dog(String name, Color color) {
        super(name);
        this.color = color;

    }

    public Color getColor() {
        return color;
    }
    public String dog(){
        return "Name " + getName() + " Color " + color;
    }



}

