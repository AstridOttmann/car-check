package org.example;
import java.util.Objects;

public class Truck {
    private int numberOfTires;
    private int numberOfDoors;
    private boolean seatBelt;
    private boolean airbag;
    private int weight;


    public Truck() {
    }

    public Truck(int numberOfTires, int numberOfDoors, boolean seatBelt, boolean airbag, int weight) {
        this.numberOfTires = numberOfTires;
        this.numberOfDoors = numberOfDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
        this.weight = weight;
    }

    public int getNumberOfTires() {
        return this.numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isSeatBelt() {
        return this.seatBelt;
    }

    public boolean getSeatBelt() {
        return this.seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean isAirbag() {
        return this.airbag;
    }

    public boolean getAirbag() {
        return this.airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Truck numberOfTires(int numberOfTires) {
        setNumberOfTires(numberOfTires);
        return this;
    }

    public Truck numberOfDoors(int numberOfDoors) {
        setNumberOfDoors(numberOfDoors);
        return this;
    }

    public Truck seatBelt(boolean seatBelt) {
        setSeatBelt(seatBelt);
        return this;
    }

    public Truck airbag(boolean airbag) {
        setAirbag(airbag);
        return this;
    }

    public Truck weight(int weight) {
        setWeight(weight);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Truck)) {
            return false;
        }
        Truck truck = (Truck) o;
        return numberOfTires == truck.numberOfTires && numberOfDoors == truck.numberOfDoors && seatBelt == truck.seatBelt && airbag == truck.airbag && weight == truck.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTires, numberOfDoors, seatBelt, airbag, weight);
    }

    @Override
    public String toString() {
        return "{" +
            " numberOfTires='" + getNumberOfTires() + "'" +
            ", numberOfDoors='" + getNumberOfDoors() + "'" +
            ", seatBelt='" + isSeatBelt() + "'" +
            ", airbag='" + isAirbag() + "'" +
            ", weight='" + getWeight() + "'" +
            "}";
    }
    
}
