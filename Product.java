public class Product {
    protected String Name;
    protected int Year;
    protected String Company;
    protected float Price;
    protected int Index;
    protected int Stock;
    protected Product_Category Product_Category;
    protected Product_Type Product_Type;
    //six-argument constructor
    public Product(int index, String name, int year , String company,
     float price, int stock, Product_Category product_category, Product_Type product_type){
        setIndex(index);
        setName(name);
        setYear(year);
        setCompany(company);
        setPrice(price);
        setStock(stock);
    } 
    public void setName( String name ) {
        Name = name;
    }

    public String getName(){
        return Name;
    }
    
    public void setYear( int year ) {
        Year = year; }
    public int getYear() {
        return Year; }
    
    public void setCompany( String company ) {
        Company = company;
    }

    public String getCompany() {
        return Company;
    }
    
    public void setPrice( float price ) {
        Price = price;
    }
              
    public float getPrice() {
        return Price;
    }
    public void setIndex(int index){
        Index = index;
    }
    public int getIndex(){
        return Index;
    }
    
    public void setStock(int stock){
        Stock = stock;
    }

    public int getStock(){
        return Stock;
    }

    public void setProduct_Category(Product_Category product_category){
        Product_Category = product_category;
    }

    public Product_Category getProduct_Category(){
        return Product_Category;
    }

    public void setProduct_Type(Product_Type product_type){
        Product_Type = product_type;
    }

    public Product_Type getProduct_Type(){
        return Product_Type;
    }

    public String toString(){
        String message;
        message = "Index: "+ getIndex();
        message += "\nName: "+ getName();
        message += "\nCategory: " + getProduct_Category().getName();
        message += "\nType: " + getProduct_Type().getName();
        message += "\nYear: " + getYear();
        message += "\nCompany: " + getCompany();
        message += "\nPrice: " + getPrice();
        message += "\nStock: " + getStock();
        return message;
    }// end method toString
    
} 
