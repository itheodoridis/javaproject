public class Mice extends Product {
    private String Technology;
    private String Connection;
   
    public Mice(int index, String name , int year , String company ,
    float price,String technology, String connection, int stock, Product_Type product_type){
        super(index, name, year, company, price, stock, product_type);
        Technology = technology;
        Connection = connection;
    } 
    public void setTechnology(String technology){
        Technology = technology;
    }
    public String getTechnology(){
        return Technology;
    }
    
    public void setConnetion(String connection){
        Connection = connection;
    }
    public String getConnection(){
        return Connection;
    }
    
    public String toString(){
        String message = super.toString();
        message += "\nProduct information: \nTechnology: " + getTechnology() + " \nConnection: " + getConnection();
        return message;
    }
}
