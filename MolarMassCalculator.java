import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MolarMassCalculator 
{
    private static Map<String, Element> elementMap = new HashMap<>();

    static 
    {
        elementMap.put("H", new Element("H", 1.008));
        elementMap.put("O", new Element("O", 15.999));
        elementMap.put("C", new Element("C", 12.011));
        elementMap.put("He", new Element("He", 4.003));
        elementMap.put("Li", new Element("Li", 6.941));
        elementMap.put("B", new Element("B", 10.81));  
        elementMap.put("Be", new Element("Be", 9.012)); 
        elementMap.put("N", new Element("N", 14.0));   
        elementMap.put("F", new Element("F", 19.00));  
        elementMap.put("Ne", new Element("Ne", 20.18));
        elementMap.put("Na", new Element("Na", 22.99)); 
        elementMap.put("Mg", new Element("Mg", 24.31));  
        elementMap.put("Al", new Element("Al", 26.98)); 
        elementMap.put("Si", new Element("Si", 28.09)); 
        elementMap.put("P", new Element("P", 30.97));   
        elementMap.put("S", new Element("S", 32.07));   
        elementMap.put("Cl", new Element("Cl", 35.45)); 
        elementMap.put("Ar", new Element("Ar", 39.95)); 
        elementMap.put("K", new Element("K", 39.10));   
        elementMap.put("Ca", new Element("Ca", 40.08)); 
        elementMap.put("Sc", new Element("Sc", 44.96)); 
        elementMap.put("Ti", new Element("Ti", 47.87)); 
        elementMap.put("V", new Element("V", 50.94));   
        elementMap.put("Cr", new Element("Cr", 52.00)); 
        elementMap.put("Mn", new Element("Mn", 54.94)); 
        elementMap.put("Fe", new Element("Fe", 55.85)); 
        elementMap.put("Co", new Element("Co", 58.93)); 
        elementMap.put("Ni", new Element("Ni", 58.69)); 
        elementMap.put("Cu", new Element("Cu", 63.55)); 
        elementMap.put("Zn", new Element("Zn", 65.39)); 
        elementMap.put("Ga", new Element("Ga", 69.72)); 
        elementMap.put("Ge", new Element("Ge", 72.61)); 
        elementMap.put("As", new Element("As", 74.92)); 
        elementMap.put("Se", new Element("Se", 78.96)); 
        elementMap.put("Br", new Element("Br", 79.90)); 
        elementMap.put("Kr", new Element("Kr", 83.8));  
        elementMap.put("Rb", new Element("Rb", 85.47)); 
        elementMap.put("Sr", new Element("Sr", 87.62)); 
        elementMap.put("Y", new Element("Y", 88.91));   
        elementMap.put("Zr", new Element("Zr", 91.22)); 
        elementMap.put("Nb", new Element("Nb", 92.91)); 
        elementMap.put("Mo", new Element("Mo", 95.94)); 
        elementMap.put("Tc", new Element("Tc", 98));    
        elementMap.put("Ru", new Element("Ru", 101.17)); 
        elementMap.put("Rh", new Element("Rh", 102.91)); 
        elementMap.put("Pd", new Element("Pd", 106.42)); 
        elementMap.put("Ag", new Element("Ag", 107.87)); 
        elementMap.put("Cd", new Element("Cd", 112.41)); 
        elementMap.put("In", new Element("In", 114.82)); 
        elementMap.put("Sn", new Element("Sn", 118.71)); 
        elementMap.put("Sb", new Element("Sb", 121.76)); 
        elementMap.put("Te", new Element("Te", 127.60));
        elementMap.put("I", new Element("I", 126.90));   
        elementMap.put("Xe", new Element("Xe", 131.29)); 
        elementMap.put("Cs", new Element("Cs", 132.91)); 
        elementMap.put("Ba", new Element("Ba", 137.38)); 
        elementMap.put("La", new Element("La", 138.91)); 
        elementMap.put("Hf", new Element("Hf", 178.49)); 
        elementMap.put("Ta", new Element("Ta", 180.95)); 
        elementMap.put("W", new Element("W", 183.84));   
        elementMap.put("Re", new Element("Re", 186.21)); 
        elementMap.put("Os", new Element("Os", 190.23)); 
        elementMap.put("Ir", new Element("Ir", 192.22)); 
        elementMap.put("Pt", new Element("Pt", 195.08)); 
        elementMap.put("Au", new Element("Au", 196.97)); 
        elementMap.put("Hg", new Element("Hg", 200.59)); 
        elementMap.put("Tl", new Element("Tl", 204.38)); 
        elementMap.put("Pb", new Element("Pb", 207.20)); 
        elementMap.put("Bi", new Element("Bi", 208.98)); 
        elementMap.put("Po", new Element("Po", 209));    
        elementMap.put("At", new Element("At", 210));    
        elementMap.put("Rn", new Element("Rn", 222));    
        elementMap.put("Fr", new Element("Fr", 223));    
        elementMap.put("Ra", new Element("Ra", 226));    
        elementMap.put("Ac", new Element("Ac", 227));    
        elementMap.put("Rf", new Element("Rf", 261));    
        elementMap.put("Db", new Element("Db", 262));    
        elementMap.put("Sg", new Element("Sg", 266));    
        elementMap.put("Bh", new Element("Bh", 264));    
        elementMap.put("Hs", new Element("Hs", 269));    
        elementMap.put("Mt", new Element("Mt", 268));    
        elementMap.put("Ds", new Element("Ds", 271));    
        elementMap.put("Rg", new Element("Rg", 272));    
        elementMap.put("Cn", new Element("Cn", 277));    
        elementMap.put("Ce", new Element("Ce", 140.12));  
        elementMap.put("Pr", new Element("Pr", 140.91));  
        elementMap.put("Nd", new Element("Nd", 144.24));  
        elementMap.put("Pm", new Element("Pm", 145));      
        elementMap.put("Sm", new Element("Sm", 150.36));  
        elementMap.put("Eu", new Element("Eu", 151.96));  
        elementMap.put("Gd", new Element("Gd", 157.25));  
        elementMap.put("Tb", new Element("Tb", 158.93));  
        elementMap.put("Dy", new Element("Dy", 162.50));  
        elementMap.put("Ho", new Element("Ho", 164.93));  
        elementMap.put("Er", new Element("Er", 167.26));  
        elementMap.put("Tm", new Element("Tm", 168.93));  
        elementMap.put("Yb", new Element("Yb", 173.08));  
        elementMap.put("Lu", new Element("Lu", 174.97));  
        elementMap.put("Th", new Element("Th", 232.04));   
        elementMap.put("Pa", new Element("Pa", 231.04));   
        elementMap.put("U", new Element("U", 238.04));     
        elementMap.put("Np", new Element("Np", 237));       
        elementMap.put("Pu", new Element("Pu", 244));       
        elementMap.put("Am", new Element("Am", 243));       
        elementMap.put("Cm", new Element("Cm", 247));      
        elementMap.put("Bk", new Element("Bk", 247));       
        elementMap.put("Cf", new Element("Cf", 251));       
        elementMap.put("Es", new Element("Es", 252));       
        elementMap.put("Fm", new Element("Fm", 257));       
        elementMap.put("Md", new Element("Md", 258));       
        elementMap.put("Lr", new Element("Lr", 262));

    }
 
    public static double calculateMolarMass(String formula) 
    {
        double totalMass = 0.0;
    
        for (int i = 0; i < formula.length(); i++) 
        {
            char currentChar = formula.charAt(i);
            StringBuilder elementSymbol = new StringBuilder();
    
            // Build the element symbol
            elementSymbol.append(currentChar);
            while (i + 1 < formula.length() && Character.isLowerCase(formula.charAt(i + 1))) 
            {
                elementSymbol.append(formula.charAt(++i));
            }
    
            int count = 1; // Default to 1 if no number follows the symbol
            
            // Check if there is a number following the symbol
            if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) 
            {
                StringBuilder countBuilder = new StringBuilder(); // StringBuilder for multi-digit number
                while (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) 
                {
                    countBuilder.append(formula.charAt(++i)); // Collect digits
                }
                count = Integer.parseInt(countBuilder.toString()); // Parse to integer
            }
    
            // Look up the element in the map
            Element element = elementMap.get(elementSymbol.toString());
            if (element != null) 
            {
                totalMass += element.getAtomicMass() * count;
            }
            else 
            {
                System.err.println("Element " + elementSymbol + " not found!");
            }
        }
    
        return totalMass; // Return the total molar mass
    }
    public static void main(String[] args)
     {
        //String formula = "H2P3O"; // Example: Water (H2O)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a formula");
        String formula = scanner.nextLine();
        double molarMass = calculateMolarMass(formula);
        System.out.println("The molar mass of " + formula + " is: " + molarMass + " g/mol");
    }
}
    




 



 
        







    
    
    

