public class MemoryRAM extends Product {
    private String Type;
    private int Size;
    private int Frequency;
    private int Stock;

//three-argument constructor
public MemoryRAM (String name , int year , String company ,
float price , String type , int size, int frequency, int stock){
    super(name, year, company, price);
    Type = type;
    Size = size;
    Frequency = frequency;
    Stock = stock;
}
public void setType(String type){
    Type = type;}
public String getType(){
    return Type;
}
public void setSize(int size){
    Size = size;}
public int getSize(){
    return Size;
}
public void setFrequency(int frequency){
    Frequency = frequency;}
public int getFrequency(){
    return Frequency;
}
public void setStock(int stock){
    Stock = stock;}
public int getStock(){
    return Stock;
}
public void print_information(){
    System.out.println("Characteristics: Type:" + Type + "Frequency:" + Frequency
    +  "Size:" + Size);
} 
}
