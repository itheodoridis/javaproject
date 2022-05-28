public class Graphics extends Product{
    private String Chipset;
    private int Memory;
    private int Stock;
    //two-argument constructor 
    public Graphics(String name , int year , String company ,
    float price,String chipset , int memory, int stock){
        super(name, year, company, price);
        Chipset = chipset;
        Memory = memory;
        Stock = stock; 
    } 
    public void setChipset(String chipset){
        Chipset = chipset;}
    public String getChipset(){
        return Chipset;
    }
    public void setMemory(int memory){
        Memory = memory;}
    public int getMemory(){
        return Memory;
    }
    public void setStock(int stock){
        Stock = stock;}
    public int getStock(){
        return Stock;
    }
    
    public void print_information(){
        System.out.println("Characteristics: Chipset:"+ Chipset + "Memory:" + Memory);
    }
      
}
