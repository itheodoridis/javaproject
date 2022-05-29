public class Order {
    private int Order_code;
    private Product Ordered_Product;
    private String Customer_name;
    private String Customer_phone_number;
    private String Order_date;
    private String Arrival_date;
    private float Total_cost;
    private String Situation;
    

    public Order(int order_code, Product ordered_product, String customer_name, 
    String customer_phone_number, String order_date, String arrival_date,String situation){
        setOrder_code(order_code);
        setProduct(ordered_product);
        setCustomer_name(customer_name);
        setCustomer_phone_number(customer_phone_number);
        setOrder_date(order_date);
        setArrival_date(arrival_date);
        setTotal_cost();
        setSituation(situation);
    }
    public void setProduct(Product ordered_product) {
        Ordered_Product = ordered_product;
    }

    public Product getProduct(){
        return Ordered_Product;
    }
    
    public void setTotal_cost(){
        Product product = getProduct();
        product.setStock(100);
        Product_Category product_category = product.getProduct_Category();
        if (product_category.getName()=="Computer Parts"){
            Total_cost = product.getStock() * product.getPrice() * 0.75f;
        }
        else{
            Total_cost = product.getStock() * product.getPrice() * 0.90f;
        }
    }

    public float getTotal_cost(){
        return Total_cost;
    }
    
    public void setOrder_code(int order_code){
        Order_code = order_code;
    }
    
    public int getOrder_code(){
        return Order_code;
    }
    
    public void setOrder_date(String order_date){
        Order_date = order_date;
    }            
    public String getOrder_date(){
        return Order_date;
    }
    
    public void setCustomer_name(String customer_name){
        Customer_name = customer_name;
    }

    public String getCustomer_name(){
        return Customer_name;
    }
    
    public void setCustomer_phone_number( String customer_phone_number){
        Customer_phone_number = customer_phone_number;
    }
    public String getCustomer_phone_number(){
        return Customer_phone_number;
    }
    
    public void setArrival_date( String arrival_date){
        Arrival_date = arrival_date;
    }
    public String getArrival_date(){
        return Arrival_date;
    }
    
    public void setSituation(String situation){
        Situation = situation;
    }            
    public String getSituation(){
        return Situation;
    }

    public String toString(){
        String message;
        message = "Order Code: "+ getOrder_code();
        message += "\nProduct: "+ getProduct().getName();
        message += "\nCustomer Name: " + getCustomer_name();
        message += "\nCustomer Phone: " + getCustomer_phone_number();
        message += "\nOrder Date: " + getOrder_date();
        message += "\nArrival Date: " + getArrival_date();
        message += "\nTotal Cost: " + getTotal_cost();
        message += "\nSituation: " + getSituation();
        return message;
    }// end method toString
}