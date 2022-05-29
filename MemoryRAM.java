public class MemoryRAM extends Product {
    private String Type;
    private int Size;
    private int Frequency;

    public MemoryRAM (int index, String name , int year , String company ,
    float price , String type , int size, int frequency, int stock, Product_Type product_type){
        super(index, name, year, company, price, stock, product_type);
        Type = type;
        Size = size;
        Frequency = frequency;
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
    public String toString(){
        String message = super.toString();
        message += "\nCharacteristics: Type: " + getType() + "\nFrequency:" + getFrequency()
        +  "\nSize: " + getSize();
        return message;
    }
}
