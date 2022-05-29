public class CPUs extends Product{
    private double Speed;
    private int Cores;
    private Boolean Integrated_graphics;
    public CPUs(int index, String name , int year , String company ,
    float price, double speed , int cores , Boolean integrated_graphics, int stock, 
    Product_Category product_category, Product_Type product_type){
        super(index,name,year,company,price,stock, product_category, product_type);
        setSpeed(speed);
        setCores(cores);
        setIntegrated_graphics(integrated_graphics);
    }
    public void setSpeed(double speed){
        Speed = speed;}
    public double getSpeed(){
        return Speed;
    }
    public void setCores(int cores){
        Cores = cores;}
    public int getCores(){
        return Cores;
    }
    public void setIntegrated_graphics(Boolean integrated_graphics){
        Integrated_graphics = integrated_graphics;}
    public Boolean getIntegrated_graphics(){
        return Integrated_graphics;
    }

    public String toString(){
        String message = super.toString();
        message += "\nCharacteristics: Speed:" + getSpeed() + "Integrated Graphics:" + getIntegrated_graphics()
        +  "Number of Cores:" + getCores();
        return message;
    }
}

