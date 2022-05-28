public abstract class Product {
    private String Name;
    private int Year;
    private String Company;
    private float Price;
    //four-argument constructor
    public Product(String name , int year , String company ,
     float price){
     Name = name;
     Year= year;
     Company= company;
     Price = price;
    } 
    public void setName( String name ) {
        Name = name; }
    public String getName() {
        return Name; }
    
    public void setYear( int year ) {
        Year = year; }
    public int getYear() {
        return Year; }
    
    public void setCompany( String company ) {
        Company = company; }
    public String getCompany() {
        return Company; }
    
    public void setPrice( float price ) {
        Price = price; }            
    public float getPrice() {
        return Price; }
    
    
      
    public String toString() {
        return String.format( "%s %s %s %s euros",
        getName(), getYear(), getCompany(), getPrice() );
        } // end method toString
    
    // abstract method overridden by subclasses
    abstract void print_information();
} 
