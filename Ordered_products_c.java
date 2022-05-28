import java.util.ArrayList;
public class Ordered_products_c implements Ordered_products {
    private ArrayList<String> Ordered_products_c = new ArrayList<String>();
    public static void main (String[] args){
       Order o1 = new Order(000001, "Xiaomi Mi Pocket Photo", "Napoleon Kontos", 695225396, "22-1-2022",
        "15-2-2022", 45, "Done"); 
       Order o2 = new Order(000002, "Powertech PT-852 Wireless Mouse", "Brasidas Makris", 695438967, "24-1-2022",
        "17-3-2022", 8, "On hold");
    }
}
