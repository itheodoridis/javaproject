import java.util.ArrayList;
public class Available_products_c implements Available_products{
    private ArrayList<String> Available_products_c = new ArrayList<String>();
    public static void main (String[] args){
        Motherboards a1 = new Motherboards("B450-A Pro Max", 2018, "MSI", 80f, "AMD", 32, 6, 14);
        CPUs a2 = new CPUs("i5-11400F", 2019, "intel CORE", 150f, 2.6f , 6, true,32 );
        MemoryRAM a3 = new MemoryRAM("CCT16G4SFR", 2020, "Crucial", 50f, "DDR4", 8, 3200, 34);
        Graphics a4 = new Graphics("RADEON RX 6600", 2021, "SAPPHIRE", 400f, "AMD", 8,17);
        Hard_Discs a5 = new Hard_Discs("WD Purple", 2020, "Western Digital", 45f, "SSD", 2.5f, 256, 5);
        Screens a6 = new Screens("DELL ADAMO XPS 13 4", 2021, "DELL", 50f, "Monitor", "1200 X 800" , 1.6f , "HDMI", 0);
        Keyboards a7 = new Keyboards("MK295", 2020, "Logictech", 32f, "wireless",0);
        Mouses a8 = new Mouses("Xiaomi Mi Dual Mode", 2021, "Xiaomi", 10f, "laser", "wireless",0);
        Printers a9 = new Printers("HP DeskJet 2721e", 2022, "HP", 60f, "laser", "colour",6);

    }
}
