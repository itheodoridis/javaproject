public class Screens extends Product {
    private String Genre;
    private String Dimensions;
    private float Resolution;
    private String Gates;
    private int Stock;

  //four-argument constructor
    public Screens (String name , int year , String company ,
    float price,String genre, String dimensions, float resolution, String gates, int stock){
        super(name, year, company, price);
        Genre = genre;
        Dimensions = dimensions;
        Resolution = resolution;
        Gates = gates;
        Stock = stock;
    } 
    public void setGenre( String genre ) {
        Genre = genre; }
    public String getGenre() {
        return Genre; }
    
    public void setDimensions( String dimensions ) {
        Dimensions = dimensions; }
    public String getDimensions() {
        return Dimensions; }
    
    public void setResolution( float resolution ) {
        Resolution = resolution; }
    public float getResolution() {
        return Resolution; }
    
    public void setGates( String gates ) {
        Gates = gates; }            
    public String getGates() {
        return Gates; }
    public void setStock(int stock ) {
        Stock = stock; }            
    public int getStock() {
        return Stock; }
    
    public void print_information(){
        System.out.println("Product information:");
        System.out.println("Genre:"+ getGenre());
        System.out.println("Dimensions:"+ getDimensions());
        System.out.println("Resolution:"+ getResolution());
        System.out.println("Gates:"+ getGates());
    }
}
    