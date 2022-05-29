import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.List;
public class MainApp {
    public static boolean Done;
    public static List<Product_Category> Category_List;
    public static List<Product_Type> Type_List;
    public static List<Product> Stock_List;

    public static void Create_Structure(){
        Product_Category parts = new Product_Category(1, "Computer Parts");
        Product_Category peripherals = new Product_Category(2, "Peripherals");
        Category_List.add(parts);
        Category_List.add(peripherals);

        Product_Type motherboards = new Product_Type(1, "Motherboards", parts);
        Product_Type cpus = new Product_Type(2, "CPUs", parts);
        Product_Type memoryram = new Product_Type(3, "MemoryRAM", parts);
        Product_Type graphics = new Product_Type(4, "Graphics", parts);
        Product_Type hard_disks = new Product_Type(5, "Hard Disks", parts);
        Product_Type screens = new Product_Type(1, "Motherboards", peripherals);
        Product_Type keyboards = new Product_Type(2, "Keyboards", peripherals);
        Product_Type mice = new Product_Type(3, "Mice", peripherals);
        Product_Type printers = new Product_Type(4, "Printers", peripherals);
        

    }

    public static void MainMenu(){
        Scanner in = new Scanner (System.in);
        int answer;
        do{
            System.out.println("0. Overview of products");
            System.out.println("1. Overview of orders");
            System.out.println("2. Overview of sales");
            System.out.println("3. Exit");
            answer = in.nextInt();
            if ((answer <= 0) && (answer>=3)){
                System.out.println("Give a valid number!! Valid numbers are : 0, 1, 2, 3");
            }
        }while ((answer <= 0) && (answer>=3));
        if (answer == 3){
            Done = true;
            return;
        }
        else {

        }
    }



    public static void main(String[] args) {
        boolean done=false;
        //int answer;
        
        

        Motherboards a1 = new Motherboards("B450-A Pro Max", 2018, "MSI", 80f, "AMD", 32, 6 ,28);
        Motherboards a10 = new Motherboards("B450-F", 2020, "Asus", 130f, "Intel", 64, 6, 36 );
        CPUs a2 = new CPUs("i5-11400F", 2019, "intel CORE", 150f, 2.6f , 6, true,12 );
        CPUs a11 = new CPUs("Ryzen 5 5600G", 2021, "AMD", 165f, 3.3f , 8, true,18 );
        MemoryRAM a12 = new MemoryRAM("Z Neo", 2018, "G.Skill Trident", 116f, "DDR5", 16, 3600,26);
        MemoryRAM a3 = new MemoryRAM("CCT16G4SFR", 2020, "Crucial", 50f, "DDR4", 8, 3200,18);
        Graphics a4 = new Graphics("RADEON RX 6600", 2021, "SAPPHIRE", 400f, "AMD", 8,0);
        Graphics a13 = new Graphics("GTX 1650", 2021, "MSI", 270f, "nVidia", 8, 9);
        Hard_Discs a5 = new Hard_Discs("WD Purple", 2020, "Western Digital", 45f, "SSD", 2.5f, 256, 1);
        Hard_Discs a14 = new Hard_Discs("970 Evo plus", 2020, "Samsung", 50f, "HDD", 1.8f, 512, 4);
        Screens a6 = new Screens("DELL ADAMO XPS 13 4", 2021, "DELL", 50f, "Monitor", "1200 X 800" , 1.6f , "HDMI", 8);
        Screens a15 = new Screens("Huawei", 2018, "Huawei Matebook D15", 80f, "TV Monitor", "800 X 1200" , 2.8f , "Display Port",0);
        Keyboards a7 = new Keyboards("MK295", 2020, "Logictech", 32f, "wireless",0);
        Keyboards a16 = new Keyboards("DELL KB216", 2021, "DELL", 60f, "wireD",37);
        Mouses a8 = new Mouses("Xiaomi Mi Dual Mode", 2021, "Xiaomi", 10f, "laser", "wireless", 15);
        Mouses a17 = new Mouses("Razer Vipor mini RGB", 2019, "Razer", 30f, "laser", "wired",31);
        Printers a9 = new Printers("HP DeskJet 2721e", 2022, "HP", 60f, "laser", "colour",26);
        Printers a18 = new Printers("Xerox B230V/DNI", 2022, "Xerox", 100f, "laser", "black&white",0);
        
        Done = false;
        while (Done == false) {
            MainMenu();
            answer=7;
            while (answer < 0) and (answer!="2") and (answer!="3") and (answer!="0") or (answer=="7"){
                System.out.println("0. Overview of products");
                System.out.println("1. Overview of orders");
                System.out.println("2. Overview of sales");
                System.out.println("3. Exit");
                answer = in.nextInt();
                if (answer!="1") && (answer!="2") && (answer!="3") && (answer!="0"){
                    System.out.println("Give a valid number!! Valid numbers are : 0, 1, 2, 3");
                }
            }
            
            if (answer.equals ("0")){
                answer="0";
                while (answer!="c1" and answer!="c2") or (answer=="0") {
                    System.out.println("c1. Computer parts");
                    System.out.println("c2. Peripheral products");
                    answer = in.nextLine();
                    if (answer!="c1" and answer!="c2"){
                        System.out.println("Give a valid category!! Valid categories are : c1, c2");
                    }   
                }
                if (answer.equals("c1")){
                    answer="0";
                    while (answer!="t1" and answer!="t2" and answer!="t3" and answer!="t4" and answer!="t5") or answer=="0"{
                    System.out.println("t1.Motherboards");
                    System.out.println("t2.CPUs");
                    System.out.println("t3.MemoryRAM");
                    System.out.println("t4.Hard Discs");
                    System.out.println("t5.Graphics");
                    answer = in.nextLine();
                        if (answer!="t1" and answer!="t2" and answer!="t3" and answer!="t4" and answer!="t5"){
                            System.out.println("Give a valid type");
                        }
                    }
                    if (answer=="t1"){
                        answer="0";
                        while (answer!="B450-A Pro Max" and answer!="B450-F") or answer=="0"{
                        System.out.println("B450-A Pro Max");
                        System.out.println("B450-F");
                        answer = in.nextLine();
                            if (answer!="B450-A Pro Max" and answer!="B450-F"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="B450-A Pro Max"){
                            a1.toString(name, year, company, price,"euros", processor_type , memory , gates, stock);
                            
                            }
                        }
                        else if (answer=="B450-F"){
                           a10.toString(name, year, company, price,"euros", processor_type , memory , gates);      
                            
                        }
                           
                    }
                    else if (answer=="t2"){
                        answer="0";
                        while (answer!="i5-11400F" and answer!="Ryzen 5 5600G") or answer=="0"{
                        System.out.println("i5-11400F");
                        System.out.println("Ryzen 5 5600G");
                        answer = in.nextLine();
                            if (answer!="i5-11400F" and answer!="Ryzen 5 5600G"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="i5-11400F"){
                            a2.toString(name, year, company, price,"euros", speed , cores ,  integrated_graphics);
                        }
                        else if (answer=="Ryzen 5 5600G"){
                           a11.toString(name, year, company, price,"euros", speed , cores , integrated_graphics);
                         }
                    }
                    else if (answer=="t3"){
                        answer="0";
                        while (answer!="Z Neo" and answer!="CCT16G4SFR") or answer=="0"{
                        System.out.println("Z Neo");
                        System.out.println("CCT16G4SFR");
                        answer = in.nextLine();
                            if (answer!="Z Neo" and answer!="CCT16G4SFR"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="Z Neo"){
                            a3.toString(name, year, company, price,"euros", type , size , frequency);
                        }
                        else if (answer=="CCT16G4SFR"){
                           a12.toString(name, year, company, price,"euros", type , size , frequency); 

                        }
                    }
                    else if (answer=="t4"){
                        answer="0";
                        while (answer!="RADEON RX 6600" and answer!="GTX 1650") or answer=="0"{
                        System.out.println("RADEON RX 6600");
                        System.out.println("GTX 1650");
                        answer = in.nextLine();
                            if (answer!="RADEON RX 6600" and answer!="GTX 1650"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="RADEON RX 6600"){
                            a4.toString(name, year, company, price,"euros", chipset, memory);

                        }
                        else if (answer=="GTX 1650"){
                           a13.toString(name, year, company, price,"euros", chipset, memory);
                           if (Stock!=0){
                                
                            }
                            else {

                            } 
                    }
                    else if (answer=="t5"){
                        answer="0";
                        while (answer!="WD Purple" and answer!="970 Evo plus") or answer=="0"{
                        System.out.println("WD Purple");
                        System.out.println("970 Evo plus");
                        answer = in.nextLine();
                            if (answer!="WD Purple" and answer!="970 Evo plus"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="WD Purple"){
                            a5.toString(name, year, company, price,"euros", type , size , capacity);
                        }
                        else if (answer=="970 Evo plus"){
                           a14.toString(name, year, company, price,"euros", type , size , capacity);

                        }
                    if (Stock!=0){



                    }
                    else {
                        System.out.println("The product is currently out of stock. Do you want to order it?");
                        answer = in.nextLine();
                        if (answer=="Yes"){
                            Scanner in = new Scanner(System.in);
                            System.out.print("Enter code: ");
                            String order_code = in.next();
                            System.out.println("code: " + order_code);
                            Scanner in = new Scanner(System.in);
                            System.out.print("Enter customer_name :");
                            String order_code = in.next();
                            System.out.println(": " + order_code);

                        }
                    }

                }

                else if (answer.equals("c2")){
                    answer="0";
                    while (answer!="t1" and answer!="t2" and answer!="t3" and answer!="t4") or answer=="0"{
                        System.out.println("t1.Screens");
                        System.out.println("t2.Keyboards");
                        System.out.println("t3.Mouses");
                        System.out.println("t4.Printers");
                        answer = in.nextLine();
                        if (answer!="t1" and answer!="t2" and answer!="t3" and answer!="t4" and answer!="t5"){
                            System.out.println("Give a valid type");
                        }
                    }
                    if (answer=="t1"){
                        answer="0";
                        while (answer!="DELL ADAMO XPS 13 4" and answer!="Huawei") or answer=="0"{
                        System.out.println("DELL ADAMO XPS 13 4");
                        System.out.println("Huawei");
                        answer = in.nextLine();
                            if (answer!="DELL ADAMO XPS 13 4" and answer!="Huawei"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="DELL ADAMO XPS 13 4"){
                            a6.toString(name, year, company, price,"euros", genre, dimensions, resolution, gates);
                            
                        }
                        else if (answer=="Huawei"){
                           a15.toString(name, year, company, price,"euros", genre, dimensions, resolution, gates);
                           
                        }
                           
                    }
                    else if (answer=="t2"){
                        answer="0";
                        while (answer!="MK295" and answer!="Razer Vipor mini RGB") or answer=="0"{
                        System.out.println("MK295");
                        System.out.println("Razer Vipor mini RGB");
                        answer = in.nextLine();
                            if (answer!="MK295" and answer!=" Razer Vipor mini RGB"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="MK295"){
                            a7.toString(name, year, company, price,"euros", connection);
                            
                        }
                        else if (answer=="Razer Vipor mini RGB"){
                           a16.toString(name, year, company, price,"euros", connection);
                           
                        }
                    }
                    else if (answer=="t3"){
                        answer="0";
                        while (answer!="Xiaomi Mi Dual Mode" and answer!="CCT16G4SFR") or answer=="0"{
                        System.out.println("Xiaomi Mi Dual Mode");
                        System.out.println("CCT16G4SFR");
                        answer = in.nextLine();
                            if (answer!="Xiaomi Mi Dual Mode" and answer!="CCT16G4SFR"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="Xiaomi Mi Dual Mode"){
                            a8.toString(name, year, company, price,"euros", technology, connection);
                           
                        }
                        else if (answer=="CCT16G4SFR"){
                           a17.toString(name, year, company, price,"euros", technology, connection);
                           
                        }
                    }
                    
                    else if (answer=="t4"){
                        answer="0";
                        while (answer!="HP DeskJet 2721e" and answer!="Xerox B230V/DNI") or answer=="0"{
                        System.out.println("HP DeskJet 2721e");
                        System.out.println("Xerox B230V/DNI");
                        answer = in.nextLine();
                            if (answer!="HP DeskJet 2721e" and answer!="Xerox B230V/DNI"){
                                System.out.println("Give a valid name");
                            }
                        }
                        if (answer=="HP DeskJet 2721e"){
                            a9.toString(name, year, company, price,"euros", technology, type);
                            if (Stock!=0){
                                
                            }
                            else {

                            }
                        }
                        else if (answer=="Xerox B230V/DNI"){
                           a18.toString(name, year, company, price,"euros", technology, type);
                
                         }

                }

                }

            }
            else if (answer.equals ("1")){
                
            }
            else if (answer.equals ("2")){

            }
            else if(answer.equals ("3")){
                done=true;
            }
        }
    }
}



        