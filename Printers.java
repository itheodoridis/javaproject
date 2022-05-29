public class Printers extends Product {
    private String Technology;
    private String Type;
    
    public Printers(int index, String name, int year , String company, 
    float price , String technology, String type, int stock, 
    Product_Category product_category, Product_Type product_type){
        super(index, name, year, company, price, stock, product_category, product_type);
        Technology = technology;
        Type = type;
    } 

    public void setTechnology(String technology){
        Technology = technology;
    }
    public String getTechnology(){
        return Technology;
    }

    public void setType(String type){
        Type = type;
    }
    public String getType(){
        return Type;
    }

    public String toString(){
        String message = super.toString();
        message += "\nProduct information: Technology: " + getTechnology() + " Type: " + getType();
        return message;
    }
}
