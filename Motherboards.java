public class Motherboards extends Product{
    private String Processor_type;
    private int Memory;
    private int Gates;
    
    public Motherboards(int index, String name , int year , String company ,
    float price, String processor_type , int memory , int gates, int stock, Product_Type product_type){
        super(index,name,year,company,price,stock,product_type);
        Processor_type = processor_type;
        Memory = memory;
        Gates = gates;
        Stock = stock; 
    } 
    public void setProcessor_type(String processor_type){
        Processor_type = processor_type;}
    public String getProcessor_type(){
        return Processor_type;
    }
    public void setMemory(int memory){
        Memory = memory;}
    public int getMemory(){
        return Memory;
    }
    public void setGates(int gates){
        Gates = gates;}
    public int getGates(){
        return Gates;
    }
    
    public String toString(){
        String message = super.toString();
        message += "\nCharacteristics: Processor_type: "+ getProcessor_type() + " Memory: " + getMemory()
        +  " Number of gates: " + getGates();
        return message;
    }
}