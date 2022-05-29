public class Hard_Disks extends Product{
    private String Type;
    private float Size;
    private int Capacity;

    public Hard_Disks(int index, String name , int year , String company ,
    float price,String type , float size , int capacity, int stock, Product_Type product_type){
        super(index, name, year, company, price, stock, product_type);
        setType(type);
        setSize(size);
        setCapacity(capacity);
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
    public String toString(){
        String message = super.toString();
        message += "\nCharacteristics: Type:"+ getType() + "Size:" + getSize()
        +  "Capacity:" + getCapacity();
        return message;
    }
}
