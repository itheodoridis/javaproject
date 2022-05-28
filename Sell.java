public class Sell {
   private int Sell_code;
   private String Name;
   private String Customer_name;
   private int Customer_phone_number;
   private String Sell_date;
   private float Total_cost;
   private String Situation;
   

   public Sell(int sell_code, String name, String customer_name, 
   int customer_phone_number, String sell_date, int total_cost,String situation ){
       Sell_code = sell_code;
       Name = name;
       Customer_name = customer_name;
       Customer_phone_number = customer_phone_number;
       Sell_date = sell_date;
       Total_cost = total_cost;
       Situation = situation;
   }
   public void setName( String name ) {
       Name = name; }
   public String getName() {
       return Name; }
   
   public void setTotal_cost( float total_cost ) {
       Total_cost = total_cost; }
   public float getTotal_cost() {
       return Total_cost; }
   
   public void setSell_code( int sell_code ) {
       Sell_code = sell_code;}
   public int getResolution() {
       return Sell_code; }
   
   public void setSell_date( String sell_date ) {
       Sell_date = sell_date; }            
   public String getSell_date() {
       return Sell_date; }
   
   public void setCustomer_name( String customer_name ) {
       Customer_name = customer_name; }
   public String getCustomer_name() {
       return Customer_name; }
   
   public void setCustomer_phone_number( int customer_phone_number ) {
       Customer_phone_number = customer_phone_number; }
   public int getCustomer_phone_number() {
       return Customer_phone_number; }
   
   public void setSituation( String situation ) {
       Situation = situation; }            
   public String getSituation() {
       return Situation; }
   


}
