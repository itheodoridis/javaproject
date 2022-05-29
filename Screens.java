public class Screens extends Product {
    private String Genre;
    private String Dimensions;
    private float Resolution;
    private String Gates;

  //four-argument constructor
    public Screens (int index, String name , int year , String company ,
    float price,String genre, String dimensions, float resolution, String gates, int stock, Product_Type product_type){
        super(index, name, year, company, price, stock, product_type);
        Genre = genre;
        Dimensions = dimensions;
        Resolution = resolution;
        Gates = gates;
    } 
    public void setGenre(String genre){
        Genre = genre;
    }
    public String getGenre(){
        return Genre;
    }
    
    public void setDimensions(String dimensions) {
        Dimensions = dimensions; }
    public String getDimensions() {
        return Dimensions; }
    
    public void setResolution(float resolution) {
        Resolution = resolution; }
    public float getResolution() {
        return Resolution; }
    
    public void setGates(String gates){
        Gates = gates;
    }            
    public String getGates(){
        return Gates;
    }

    public String toString(){
        String message = super.toString();
        message += "\nProduct information: Genre: " + getGenre() + " Dimensions: " + getDimensions()
        + "\n\tResolution:"+ getResolution() + " Gates: "+ getGates();
        return message;
    }
}
    