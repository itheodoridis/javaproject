import java.util.Scanner;
//import java.util.jar.Attributes.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class MainApp {
    //public static boolean Done = false;
    public static List<Product_Category> Category_List;
    public static List<Product_Type> Type_List_Parts, Type_List_Peripherals;
    public static List<Product> Stock_List;
    public static List<Order> Order_List;
    public static List<Sell> Sell_List;
    public static Product_Category category_choice;
    public static Product_Type type_choice;
    public static Scanner in = new Scanner (System.in);
    public static Scanner inString = new Scanner (System.in);
    
    public static void Create_Shop(){
        Product_Category parts = new Product_Category(1, "Computer Parts");
        Product_Category peripherals = new Product_Category(2, "Peripherals");
        Category_List = new ArrayList<Product_Category>();
        Category_List.addAll(Arrays.asList(parts,peripherals));

        Product_Type motherboards = new Product_Type(1, "Motherboards", parts);
        Product_Type cpus = new Product_Type(2, "CPUs", parts);
        Product_Type memoryram = new Product_Type(3, "MemoryRAM", parts);
        Product_Type graphics = new Product_Type(4, "Graphics", parts);
        Product_Type hard_disks = new Product_Type(5, "Hard Disks", parts);
        Product_Type screens = new Product_Type(1, "Motherboards", peripherals);
        Product_Type keyboards = new Product_Type(2, "Keyboards", peripherals);
        Product_Type mice = new Product_Type(3, "Mice", peripherals);
        Product_Type printers = new Product_Type(4, "Printers", peripherals);
        Type_List_Parts = new ArrayList<>();
        Type_List_Parts.addAll(Arrays.asList(motherboards,cpus,memoryram,graphics,hard_disks));
        Type_List_Peripherals = new ArrayList<>();
        Type_List_Peripherals.addAll(Arrays.asList(screens,keyboards,mice,printers));

        Motherboards a1 = new Motherboards(1,"B450-A Pro Max", 2018, "MSI", 80f, 
        "AMD", 32, 6 ,28, motherboards);
        Motherboards a10 = new Motherboards(2,"B450-F", 2020, "Asus", 130f, 
        "Intel", 64, 6, 36, motherboards );
        CPUs a2 = new CPUs(1,"i5-11400F", 2019, "intel CORE", 150f, 2.6f , 6, true,12, cpus);
        CPUs a11 = new CPUs(2,"Ryzen 5 5600G", 2021, "AMD", 165f, 3.3f , 8, true,18, cpus);
        MemoryRAM a12 = new MemoryRAM(1,"Z Neo", 2018, "G.Skill Trident", 116f, "DDR5", 16, 3600,26,memoryram);
        MemoryRAM a3 = new MemoryRAM(2,"CCT16G4SFR", 2020, "Crucial", 50f, "DDR4", 8, 3200,18,memoryram);
        Graphics a4 = new Graphics(1,"RADEON RX 6600", 2021, "SAPPHIRE", 400f, "AMD", 8,0,graphics);
        Graphics a13 = new Graphics(2,"GTX 1650", 2021, "MSI", 270f, "nVidia", 8, 9,graphics);
        Hard_Disks a5 = new Hard_Disks(1,"WD Purple", 2020, "Western Digital", 45f, "SSD", 2.5f, 256, 1, hard_disks);
        Hard_Disks a14 = new Hard_Disks(2,"970 Evo plus", 2020, "Samsung", 50f, "HDD", 1.8f, 512, 4, hard_disks);
        Screens a6 = new Screens(1,"DELL ADAMO XPS 13 4", 2021, "DELL", 50f, 
        "Monitor", "1200 X 800" , 1.6f , "HDMI", 8, screens);
        Screens a15 = new Screens(2,"Huawei", 2018, "Huawei Matebook D15", 80f, 
        "TV Monitor", "800 X 1200" , 2.8f , "Display Port",0, screens);
        Keyboards a7 = new Keyboards(1,"MK295", 2020, "Logictech", 32f, "wireless",0, keyboards);
        Keyboards a16 = new Keyboards(2,"DELL KB216", 2021, "DELL", 60f, "wireD",37, keyboards);
        Mice a8 = new Mice(1,"Xiaomi Mi Dual Mode", 2021, "Xiaomi", 10f, "laser", "wireless", 15,mice);
        Mice a17 = new Mice(2,"Razer Vipor mini RGB", 2019, "Razer", 30f, "laser", "wired",31, mice);
        Printers a9 = new Printers(1,"HP DeskJet 2721e", 2022, "HP", 60f, "laser", "colour",26, printers);
        Printers a18 = new Printers(2,"Xerox B230V/DNI", 2022, "Xerox", 100f, "laser", "black&white",0, printers);
        
        Stock_List = new ArrayList<>();
        Stock_List.addAll(Arrays.asList(a1,a10,a2,a11,a12,a3,a4,a13,a5,a14,a6,a15,a7,a16,a8,a17,a9,a18));

        Order_List = new ArrayList<>();
        Sell_List = new ArrayList<>();
        
        return;
    }

    public static boolean MainMenu() throws ParseException{
        boolean check = false;
        int answer;
        do{
            System.out.println("\nChoose wisely:");
            System.out.println("0. Overview of products");
            System.out.println("1. Overview of orders");
            System.out.println("2. Overview of sales");
            System.out.println("3. Exit");
            in = new Scanner(System.in);
            answer = in.nextInt();
            System.out.println("Got option:" + answer);
            if ((answer < 0) || (answer>3)){
                System.out.println("Give a valid number!! Valid numbers are : 0 - 3");
            }
            else{
                if (answer == 0){
                    Select_Category_Menu();
                    //System.out.println("Returning from Category menu");
                }
                else if (answer == 1){
                    int num_Orders = Order_List.size();
                    if (num_Orders > 0) Print_Orders();
                    else System.out.println("No Orders to print");
                }
                else if (answer == 2){
                    int num_Sales = Sell_List.size();
                    if (num_Sales > 0) Print_Sales();
                    else System.out.println("No Sales to print");
                }
                else{
                    check = true;
                }
            }
        }while ((answer < 0) || (answer > 3) || (check == false));
        System.out.println("Out of Main Menu");
        return check;
    }

    public static boolean Select_Category_Menu() throws ParseException{
        int answer;
        boolean check = false;
        do{
            System.out.println("Choose Product Category:");
            System.out.println("1. Computer parts");
            System.out.println("2. Peripheral products");
            System.out.println("3. Return to previous menu");

            answer = in.nextInt();
            if ((answer < 1) || (answer > 3)){
                System.out.println("Give a valid option!! Valid options are : 1-3");
            }
            else if(answer != 3){
                category_choice = Category_List.get(answer-1);
                check = Select_Product_Type_Menu(category_choice);
                //System.out.println("Returning from Product Type menu");
            }
            else{
                return false;
            }
        } while ((answer < 1) || (answer>3) || (check == false));
        return true;
    }

    public static boolean Select_Product_Type_Menu(Product_Category category_choice) throws ParseException{
        int answer;
        List<Product_Type> Type_List_current;
        Product_Type item;
        if (category_choice.getName() == "Computer Parts"){
            Type_List_current = Type_List_Parts;
        }
        else{
            Type_List_current = Type_List_Peripherals;
        }
        boolean check = false;
        do{
            System.out.println("Choose Product Type: 1 - " + Type_List_current.size() + " or 0");
            for (int i=0;i<Type_List_current.size();i++){
                item = Type_List_current.get(i);
                System.out.println(item.getIndex() + ". " + item.getName() + " :");
            }
            System.out.println("0. Return to previous menu");

            answer = in.nextInt();
            if ((answer < 0) || (answer >= Type_List_current.size())){
                System.out.println("Give a valid type 1 - " + Type_List_current.size() + " or 0");
            }
            else if (answer != 0){
                type_choice = Type_List_current.get(answer-1);
                check = Select_Product_Menu(category_choice,type_choice);
                //System.out.println("Returning from Product menu");
            }
            else{
                return false;
            }
        } while ((answer < 0) || (answer >= Type_List_current.size()) || (check==false));
        return true;
    }

    public static boolean Select_Product_Menu(Product_Category category_choice, Product_Type type_choice) throws ParseException{
        int answer;
        //boolean check = false;
        List<Product> Product_List = new ArrayList<Product>();
        Product item;
        do{
            System.out.println("Choose Product:");
            for (int i=0;i<Stock_List.size();i++){
                item = Stock_List.get(i);
                if ((item.getProduct_Category().equals(category_choice)) && (item.getProduct_Type().equals(type_choice))){
                    Product_List.add(item);
                    System.out.println(item.getIndex() + ": " + item.getName() + " :");
                }
            }
            System.out.println("0: Back to previous menu");
            System.out.println("Total products: " + Product_List.size());
            int sell_code;
            int order_code;
            answer = in.nextInt();
            if ((answer < 0) || (answer > Product_List.size())){
                System.out.println("Give a valid product index or 0");
            }
            else if (answer != 0){
                item = Product_List.get(answer-1);
                System.out.println(item);
                if (item.getStock()>0){
                    if (Sell_List.size() == 0){
                        sell_code = 1;
                    }
                    else {
                        sell_code = Sell_List.size()+1;
                    }

                    //System.out.println("\n");
                    System.out.println("\nEnter Customer Name:");
                    String customer_name = inString.nextLine();
                    System.out.println("Enter Customer Phone number:");
                    String customer_phone_number = inString.nextLine();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
                    LocalDate localDate = LocalDate.now();
                    String sell_date = dtf.format(localDate);
                    System.out.println("Today's date captured");
                    Sell sell_item = new Sell(sell_code, item, customer_name, customer_phone_number, sell_date);
                    Sell_List.addAll(Arrays.asList(sell_item));
                    System.out.println("Sell added to Sell List");
                    System.out.println("Sell List size: "+ Sell_List.size());
                }
                else{
                    System.out.println("The product is currently out of stock. Do you want to order it?");
                    do{
                        System.out.println("1. yes \n2. no");
                        answer = in.nextInt();
                        if ((answer < 1) || (answer > 2)){
                            System.out.println("Give a valid product choice: 1 or 2");
                        }
                    } while ((answer < 1) || (answer > 2));
                    if (answer == 2){
                        return true;
                    }
                    else{
                        if (Order_List.size() == 0){
                            order_code = 1;
                        }
                        else{
                            order_code = Order_List.size()+1;
                        }
                        System.out.println("Enter Customer Name:");
                        String customer_name = inString.nextLine();
                        System.out.println("Enter Customer Phone number:");
                        String customer_phone_number = inString.nextLine();
                        SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yy");
                        Date localDate = new Date();
                        String order_date = date_format.format(localDate);
                        String arrival_date;
                        Date get_arrival_date;
                        do{
                            System.out.println("Enter Order Arrival Date (dd/MM/yy):");
                            inString = new Scanner (System.in);
                            arrival_date = inString.nextLine();
                            try{
                                get_arrival_date = date_format.parse(arrival_date);
                                if (get_arrival_date.before(localDate)){
                                    System.out.println("Give a valid arrival date same or after " + order_date);
                                }
                            }
                            catch (ParseException e1) {
                                System.out.println("Got parse exception,"+ e1 +", setting arrival date to " + order_date);
                                get_arrival_date = localDate;
                            }

                        }while (get_arrival_date.before(localDate));
                        String situation = "Expected";
                        Order order_item = new Order(order_code, item, customer_name, customer_phone_number, order_date, arrival_date, situation);
                        Order_List.addAll(Arrays.asList(order_item));

                    }
                }
                //System.out.println("Done with this product");
            }
            else{

                return false;
            }
        }while((answer < 0) || (answer > Product_List.size()));
        //System.out.println("Returning To Product_Type Menu");
        return true;
    }

    public static boolean Print_Orders(){
        Scanner in = new Scanner (System.in);
        Order order_item;
        int order_code;
        int answer;
        System.out.println("\nOrder List:");
        for (int i=0;i<Order_List.size();i++){
            order_item = Order_List.get(i);
            System.out.println(order_item);
        }
        boolean found = false;
        do{
            System.out.println("\nPlease choose an order code: 1 - " + Order_List.size() + " or 0 to go to the main menu:");
            order_code = in.nextInt();
            if (order_code == 0){
                return false;
            }
            for (int i=0;i<Order_List.size();i++){
                order_item = Order_List.get(i);
                if (order_item.getOrder_code() == order_code){
                    found=true;
                    order_code = order_item.getOrder_code();
                    System.out.println(order_item);
                    if (order_item.getSituation() == "Executed") {
                        System.out.println("\n Can't do it! Order is already executed");
                        return false;
                    }
                    System.out.println("Do you want to set the order as arrived and sold?");
                    do{
                        System.out.println("1. yes \n2. no");
                        answer = in.nextInt();
                        if ((answer < 1) || (answer > 2)){
                            System.out.println("Give a valid choice: 1 or 2");
                        }
                    } while ((answer < 1) || (answer > 2));
                    if (answer == 1){
                        System.out.println(order_item);
                        order_item.setSituation("Executed");
                        int sell_code;
                        if (Sell_List.size() == 0){
                            sell_code = 1;
                        }
                        else {
                            sell_code = Sell_List.size()+1;
                        }
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
                        LocalDate localDate = LocalDate.now();
                        String sell_date = dtf.format(localDate); 
                        Sell sell_item = new Sell(sell_code, order_item.getProduct(), order_item.getCustomer_name(), 
                        order_item.getCustomer_phone_number(), sell_date);
                        Sell_List.addAll(Arrays.asList(sell_item));
                        //Order_List.remove(order_item);
                    }
                }
            }
            if ((order_code != 0) && (found == false)){
                System.out.println("Give a valid order code: 1 - " + Order_List.size() + "or 0");
            }
        }while ((order_code != 0) && (found == false));

        return true;
    }

    public static void Print_Sales(){
        Scanner in = new Scanner (System.in);
        System.out.println("\nSell List:");
        Sell sell_item ;
        for (int i=0;i<Sell_List.size();i++){
            sell_item = Sell_List.get(i);
            System.out.println(sell_item);
        }
        return;
    }

    public static void main(String[] args) throws ParseException {
        Create_Shop();  
        boolean done = false;
        while (!done){
            done = MainMenu();
            System.out.println("returned with " + done);
            if (!done) System.out.println("Back at it");
        }

    }
}



        