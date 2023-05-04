package edu.guilford;

public class Bird extends Animal {
    // attributes
    private Double flightspeed;

    //new constructor with all the bird attributes
    public Bird(String name, String species, int age, Double flightspeed) {
        super(name, species, age);
        this.flightspeed = flightspeed;
    }

    // constructor
    public Bird() {
        super();
        // create an array of double with flightspeed
        Double[] flightspeeds = { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0 };
        this.getName();
        // set the flightspeed to a random flightspeed from the flightspeeds array
        this.flightspeed = flightspeeds[rand.nextInt(flightspeeds.length)];
    }

    // getters and setters
    public Double getFlightspeed() {
        return flightspeed;
    }

    // methods

    // toString

    @Override

    public String toString() {
        return "Bird{" + "Name='" + getName() + '\'' + "Age='" + getAge() + '\'' +
                "flightspeed='" + flightspeed + '\'' + "LifeStatus='" + LifeStatus() + '\'' +
                '}';
    }

}
