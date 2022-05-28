public class CPUs extends Product{
    private double Speed;
    private int Cores;
    private Boolean Integrated_graphics;
    private int Stock;
    public CPUs(String name , int year , String company ,
    float price, double speed , int cores , Boolean integrated_graphics, int stock){
        super(name,year,company,price);
        Speed = speed;
        Cores = cores;
        Integrated_graphics = integrated_graphics;
        Stock = stock;
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
public void setStock(int stock){
    Stock = stock;}
public int getStock(){
    return Stock;
}
public void print_information(){
    System.out.println("Characteristics: Speed:" + Speed + "Integrated Graphics:" + Integrated_graphics
    +  "Number of Cores:" + Cores);
}
}

