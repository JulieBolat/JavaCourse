package OOPRecap.OnlineShopTASK;

public class Shop {

    public static void main(String[] args) {

        Customer customer1 = new NormalCustomer("John", "New York, US");

        Item item1 = new Item("Pasta", 10.99);
        customer1.addItemToCart(item1);

        customer1.addItemToCart(new Item("Foam", 5));
        customer1.addItemToCart(new Item("TV", 599.90));

        customer1.removeItemFromCart(item1);

        double cartTotal = customer1.getCartTotal();

        String customerInfo = customer1.toString();
        System.out.println(customerInfo);
        System.out.println("CartTotal = " + cartTotal);

    }

}
