public class Cart implements HotelService {
    @Override
    public String getServiceName() {
        return "Cart";
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("[Cart] " + numberOfCarts + " luggage cart(s) are on the way.");
    }
}
