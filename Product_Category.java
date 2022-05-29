public class Product_Category{
    protected String Name;
    protected int Index;
    protected Product_Type[] Product_Types;
    public Product_Category(int index, String name, Product_Type[] product_types){
        Name = name;
        Index = index;
        Product_Types = product_types;
    }

    public int getIndex(){
        return Index;
    }
    public String getName(){
        return Name;
    }

    public String toString() {
        String message = getIndex() + ": " + getName() + "include the following product types: \n";
        for (Product_Type ptype : Product_Types)
            message += ptype.getName();
        return message;
    }
}