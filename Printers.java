public class Printers extends Product {
    private String Technology;
    private String Type;
    private int Stock;
    
//two-argument constructor
public Printers(String name, int year , String company, float price , String technology, String type, int stock){
    super(name, year, company, price);
    Technology = technology;
    Type = type;
    Stock = stock;
} 
public void setTechnology( String technology ) {
    Technology = technology; }
public String getTechnology() {
    return Technology; }

public void setType( String type ) {
    Type = type; }
public String getType() {
    return Type; }
public void setStock( int stock ) {
    Stock = stock; }
public int getStock() {
    return Stock; }

public void print_information(){
    System.out.println("Product information:");
    System.out.println("Technology:"+ getTechnology());
    System.out.println("Type:"+ getType());
}
}
