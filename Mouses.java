public class Mouses extends Product {
    private String Technology;
    private String Connection;
    private int Stock;
    

  //two-argument constructor
    public Mouses(String name , int year , String company ,
    float price,String technology, String connection, int stock){
        super(name, year, company, price);
        Technology = technology;
        Connection = connection;
        Stock = stock;
    } 
    public void setTechnology( String technology ) {
        Technology = technology; }
    public String getTechnology() {
        return Technology; }
    
    public void setConnetion( String connection ) {
        Connection = connection; }
    public String getConnection() {
        return Connection; }
    
    public void setStock( int stock ) {
        Stock = stock; }
    public int getStock() {
        return Stock; }
    
    public void print_information(){
        System.out.println("Product information:");
        System.out.println("Technology:"+ getTechnology());
        System.out.println("Connection:"+ getConnection());
    }
}
