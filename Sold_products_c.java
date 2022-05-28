import java.util.ArrayList;
public class Sold_products_c implements Sold_products{
    private ArrayList<String> Sold_products_c = new ArrayList<String>();      
    public static void main (String[] args){
        Sell s1 = new Sell(000001, "B450-A Max", "Georgios Papadopoulos", 698783577, "03-05-2022", 
        56, "Done");
       Sell s2 = new Sell(000002, "WD Blue", "Christos Georgiou", 697733987,"07-09-2022",
        80,"On hold");
    }
}