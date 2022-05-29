
public class Product_Type {

    protected String Name;
    protected int Index;
    protected Product_Category Product_Category;
    public Product_Type(int index, String name, Product_Category product_category){
        setName(name);
        setIndex(index);
        setProduct_Category(product_category);
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
    
    public void setProduct_Category(Product_Category product_category){
        Product_Category = product_category;
    }
    public Product_Category getProduct_Category(){
        return Product_Category;
    }

    public String toString() {
        return String.format( "Index: %s Name: %s Product Category: %s",
        getIndex(), getName(), getProduct_Category().getName());
    }
}