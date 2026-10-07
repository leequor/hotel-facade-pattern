public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    // Combined operations
    public void checkIn(int roomNumber, int numberOfCarts) {
        System.out.println("--- Guest Check-In ---");
        cart.requestCart(numberOfCarts);
        houseKeeping.cleanRoom(roomNumber);
        System.out.println("Check-in complete for room " + roomNumber + ".\n");
    }

    public void checkOut(int roomNumber, String plateNumber) {
        System.out.println("--- Guest Check-Out ---");
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        System.out.println("Check-out complete for room " + roomNumber + ".\n");
    }

    // Individual operations delegated to the services
    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}
