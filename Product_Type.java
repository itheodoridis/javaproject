
public class Product_Type {

    protected String Name;
    protected int Index;
    protected String[] Products;
    public Product_Type(int index, String name){
        Index = index;
        Name = name;
    }

    public int getIndex(){
        return Index;
    }

    public String getName(){
        return Name;
    }
    
    public String toString() {
        return String.format( "Index:%s Name:%s ",
        getIndex(), getName() );
    }
}