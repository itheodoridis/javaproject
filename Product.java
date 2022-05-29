public abstract class Product {
    protected String Name;
    protected int Year;
    protected String Company;
    protected float Price;
    protected int Index;
    //four-argument constructor
    public Product(int index, String name, int year , String company,
     float price){
        Index = index;
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
    
    public int getIndex(){
        return Index;
    }
    
    public String toString() {
        return String.format( "%s %s %s %s euros",
        getName(), getYear(), getCompany(), getPrice() );
        } // end method toString
    
    // abstract method overridden by subclasses
    abstract void print_information();
} 
