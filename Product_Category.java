public class Product_Category{
    protected String Name;
    protected int Index;

    public Product_Category(int index, String name){
        setName(name);
        setIndex(index);
    }

    public void setIndex(int index){
        Index = index;
    }
    public int getIndex(){
        return Index;
    }
    public void setName(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }

    public String toString(){
        String message = getIndex() + ": " + getName();
        return message;
    }
}