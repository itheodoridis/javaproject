public class Hard_Discs extends Product{
    private String Type;
    private float Size;
    private int Capacity;
    private int Stock;
    //three-argument constructor 
    public Hard_Discs(String name , int year , String company ,
    float price,String type , float size , int capacity, int stock){
        super(name, year, company, price);
        Type = type;
        Size = size;
        Capacity = capacity;
        Stock = stock;
    } 
    public void setType(String type){
        Type = type;}
    public String getType(){
        return Type;
    }
    public void setSize(float size){
        Size = size;}
    public float getSize(){
        return Size;
    }
    public void setCapacity(int capacity){
        Capacity = capacity;}
    public int getCapacity(){
        return Capacity;
    }
    public void setStock(int stock){
        Stock = stock;}
    public int getStock(){
        return Stock;
    }
    
    public void print_information(){
        System.out.println("Characteristics: Type:"+ Type + "Size:" + Size
        +  "Capacity:" + Capacity);
    }
}
