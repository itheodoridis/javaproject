public class Graphics extends Product{
    private String Chipset;
    private int Memory;

    public Graphics(int index, String name , int year , String company ,
    float price,String chipset , int memory, int stock, Product_Type product_type){
        super(index,name, year, company, price, stock, product_type);
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
    
    public String toString(){
        String message = super.toString();
        message += "\nCharacteristics: Chipset:"+ getChipset() + "\nMemory:" + getMemory();
        return message;
    }
}
