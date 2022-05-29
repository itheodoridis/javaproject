//import java.util.Scanner;

public class Order {
    private int Order_code;
    private String Name;
    private String Customer_name;
    private int Customer_phone_number;
    private String Order_date;
    private String Arrival_date;
    private int Total_cost;
    private String Situation;

    public Order(int order_code, String name, String customer_name, 
    int customer_phone_number, String order_date, String arrival_date, int total_cost,String situation ){
        Order_code = order_code;
        Name = name;
        Customer_name = customer_name;
        Customer_phone_number = customer_phone_number;
        Order_date = order_date;
        Arrival_date = arrival_date;
        Total_cost = total_cost;
        Situation = situation;
    }
    public void setName( String name ) {
        Name = name; }
    public String getName() {
        return Name; }
    
    public void setTotal_cost( int total_cost ) {
        Total_cost = total_cost; }
    public int getTotal_cost() {
        return Total_cost; }
    
    public void setOrder_code( int order_code ) {
        Order_code = order_code;}
    public int getOrder_code() {
        return Order_code; }
    
    public void setOrder_date( String order_date ) {
        Order_date = order_date; }            
    public String getOrder_date() {
        return Order_date; }
    
    public void setCustomer_name( String customer_name ) {
        Customer_name = customer_name; }
    public String getCustomer_name() {
        return Customer_name; }
    
    public void setCustomer_phone_number( int customer_phone_number ) {
        Customer_phone_number = customer_phone_number; }
    public int getCustomer_phone_number() {
        return Customer_phone_number; }
    
    public void setArrival_date( String arrival_date ) {
        Arrival_date = arrival_date;}
    public String getArrival_date() {
        return Arrival_date; }
    
    public void setSituation( String situation ) {
        Situation = situation; }            
    public String getSituation() {
        return Situation;
    }
}