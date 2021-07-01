package OOPRecap.OnlineShopTASK;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    private String customerName;
    private String customerAddress;
    private List<Item> cart = new ArrayList<>();

    public Customer(String customerName, String customerAddress){
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void addItemToCart(Item item){
        this.cart.add(item);
    }

    public void removeItemFromCart(Item item){
        this.cart.remove(item);
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getCustomerAddress(){
        return this.customerAddress;
    }

    public void setCustomerAddress(String address){
        this.customerAddress = address;
    }

    public List<Item> getCart(){
        return this.cart;
    }

    public abstract double getCartTotal();

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", cart=" + cart +
                '}';
    }
}