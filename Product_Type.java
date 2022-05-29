
public class Product_Type {
    //private String Motherboards;
    //private String MemoryRAM;
    //private String CPUs;
    //private String Hard_Discs;
    //private String Graphics;
    //five-argument constructor
    protected String name;
    protected int index;
    public Product_Type(int index, String name){
        Index = index;
        Name = name;
    }

    public int getIndex(){
        return Index;
    }
    
    // ίσως πρέπει να αλλάξει και να γίνει abstract
    public String toString() {
        return String.format( "Computer Parts include the following products:\n%s\n%s\n%s\n%s\n%s",
        getMotherboards(), getMemoryRAM(), getCPUs(), getHard_Discs(), getGraphics() );
        } // end method toString
}