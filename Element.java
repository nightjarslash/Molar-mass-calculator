public class Element {
    private double atomicMass;
    private String symbol;

    public Element(String symbol, double atomicMass) 
    {
        this.symbol = symbol;       // Set the element's symbol
        this.atomicMass = atomicMass; // Set the element's atomic mass
    }

     // Getter for symbol
     public String getSymbol() 
     {
        return symbol;
     }

    // Setter for symbol
    public void setSymbol(String symbol) 
    {
        this.symbol = symbol;
    }

    // Getter for atomicMass
    public double getAtomicMass() 
    {
        return atomicMass;
    }

    // Setter for atomicMass
    public void setAtomicMass(double atomicMass) 
    {
        this.atomicMass = atomicMass;
    }


    
}
