package com.company;

public class Dog extends Pet {
  private Color color;

    public Dog(String name, Color color) {
        super(name);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void dog(){
        System.out.println("Name" + getName());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color=" + color +
                '}';
    }
}

