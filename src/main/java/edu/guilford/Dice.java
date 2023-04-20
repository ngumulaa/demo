package edu.guilford;

public class Dice {
    
    //attributes

    private int numSides;   
    private int value; 

    //constructors
    public Dice() {
        numSides = 6; 
        value = 1; 
    }

    public Dice(int numSides)  { 
        this.numSides = numSides; 
        value = 1; 
    }

    //methods 
    public int roll()  { 
        value = (int) (Math.random() * numSides) + 1; 
        return value; 
    }

    public int getValue() { 
        return value; 
    }

    public int getNumSides()  { 
        return numSides; 
    }

    public void setNumSides(int numSides) { 
        this.numSides = numSides; 
    }
}
