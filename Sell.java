public class Sell {
    private int Sell_code;
    private Product Sell_product;
    private String Customer_name;
    private String Customer_phone_number;
    private String Sell_date;
    private float Total_cost;
    
    public Sell(int sell_code, Product product, String customer_name, 
    String customer_phone_number, String sell_date){
        setSell_code(sell_code);
        setProduct(product);
        setCustomer_name(customer_name);
        setCustomer_phone_number(customer_phone_number);
        setSell_date(sell_date);
        setTotal_cost();
    }
   
    public void setProduct(Product product){
        Sell_product = product;
    }

    public Product getProduct() {
        return Sell_product; }

    public void setTotal_cost() {
        Product product = getProduct();
        int stock = product.getStock();
        Product_Category product_category = product.getProduct_Category();
        if (product_category.getName()=="Computer Parts"){
            Total_cost = stock * product.getPrice() * 0.75f;
        }
        else{
            Total_cost = stock * product.getPrice() * 0.90f;
        }
        product.setStock(0);
    }

    public float getTotal_cost(){
        return Total_cost;
    }

    public void setSell_code(int sell_code ){
        Sell_code = sell_code;
    }
    public int getSell_code(){
        return Sell_code;
    }

    public int getResolution(){
        return Sell_code;
    }

    public void setSell_date(String sell_date){
        Sell_date = sell_date;
    }

    public String getSell_date(){
        return Sell_date;
    }

    public void setCustomer_name(String customer_name){
        Customer_name = customer_name;
    }

    public String getCustomer_name() {
        return Customer_name; }

    public void setCustomer_phone_number(String customer_phone_number){
        Customer_phone_number = customer_phone_number;
    }

    public String getCustomer_phone_number(){
        return Customer_phone_number;
    }
    public String toString(){
        String message;
        message = "\nSell Code: "+ getSell_code();
        message += "\nProduct: "+ getProduct().getName();
        message += "\nCustomer Name: " + getCustomer_name();
        message += "\nCustomer Phone: " + getCustomer_phone_number();
        message += "\nSell Date: " + getSell_date();
        message += "\nTotal Cost: " + getTotal_cost();
        return message;
    }// end method toString
}
