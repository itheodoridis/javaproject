public abstract class Peripheral_products {

    private String Screens;
    private String Keyboards;
    private String Mouses;
    private String Printers;
    //four-argument constructor
    public Peripheral_products(String screens , String keyboards, String mouses, String printers){
        Screens = screens;
        Keyboards = keyboards;
        Mouses = mouses;
        Printers = printers;
    }
    public void setScreens( String screens ) {
        Screens= screens;}
    public String getScreens() {
        return Screens; }
        
    public void setKeyboards( String keyboards ) {
        Keyboards = keyboards; }
    public String getKeyboards() {
        return Keyboards; }
    
    public void setMouses( String mouses ) {
        Mouses = mouses; }
    public String getMouses() {
        return  Mouses; }
    
    public void setPrinters( String printers ) {
        Printers = printers; }
    public String getPrinters() {
        return Printers; }

    
    public String toString() {
        return String.format( "Peripheral products include the following products:\n%s\n%s\n%s\n%s",
        getScreens(), getKeyboards(), getMouses(), getPrinters() );
        } // end method toString
}

