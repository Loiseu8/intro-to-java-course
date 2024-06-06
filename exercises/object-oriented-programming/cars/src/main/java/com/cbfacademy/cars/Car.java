package com.cbfacademy.cars;
public class Car {
    static void main(String[] args) {

       private String make;
       private String model;
       private String year;
       private String colour;

public Car(string make, string model, int year, string colour) {

    this.make = make;
    this.model = model;
    this.year = year;
    this.colour = colour;
    
}

// public static void getDetails() {
    //System.out.println("This car is a: " + colour + model + " made in the year " + year + ".");
//    }

public string getMake() {
    return this.make; 
}

public string getModel() {
    return this.model;
}

public int getYear() {
    return this.year;
}

public string getColour() {
    return this.colour;

}

public void setColour(string colour) {
   this.colour = colour;
}

    }

    Car volvo = new Car("Volvo", "V40", 2012, "blue");
    Car porsche = new Car("Porsche", "Panamera", 2009, "red");
    Car audi = new Car("Audi", "A3", 2018, grey);

}



