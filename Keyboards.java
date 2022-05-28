public class Keyboards extends Product {
    private String Connection;
    private int Stock;

  //one-argument constructor
    public Keyboards (String name , int year , String company ,
    float price,String connection, int stock){
        super(name, year, company, price);
        Connection = connection;
        Stock = stock;
    } 
    public void setConnection( String connection ) {
        Connection = connection; }
    public String getConnection() {
        return Connection;}

    public void setStock( int stock ) {
        Stock = stock; }
    public int getStock() {
        return Stock;}

    public void print_information(){
        System.out.println("Product information:"+"Connection:"+ getConnection());
    }
}
   