public class Keyboards extends Product {
    private String Connection;

    public Keyboards (int index, String name , int year , String company ,
    float price,String connection, int stock, Product_Type product_type){
        super(index, name, year, company, price, stock, product_type);
        Connection = connection;
    } 
    public void setConnection(String connection){
        Connection = connection;
    }
    public String getConnection(){
        return Connection;
    }
    
    public String toString(){
        String message = super.toString();
        message += "\nProduct information:"+"Connection:"+ getConnection();
        return message;
    }
}
   