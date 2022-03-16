package com.company;

public class Shelter extends Dog {
    private String address;

    public Shelter(String name,  Color color, String address1) {
        super(name,  color);
        this.address = address1;
    }

    public String getAddress() {
        return address;
    }

    public String info(){
        return super.dog() + " Adress " + address;

    }
}
