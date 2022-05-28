public class Motherboards extends Product{
    private String Processor_type;
    private int Memory;
    private int Gates;
    private int Stock;
    //three-argument constructor 
    public Motherboards(String name , int year , String company ,
    float price, String processor_type , int memory , int gates, int stock){
        super(name,year,company,price);
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
    public void setStock(int stock){
        Stock = stock;}
    public int getStock(){
        return Stock;
    }
    
    public void print_information(){
        System.out.println("Characteristics: Processor_type:"+ Processor_type + "Memory:" + Memory
        +  "Number of gates:" + Gates);
    }
      
}