public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Guest arrives
        frontDesk.checkIn(305, 2);

        // Guest asks for individual services
        frontDesk.requestCart(1);
        frontDesk.cleanRoom(305);

        // Guest leaves
        frontDesk.checkOut(305, "ABC-1234");
    }
}
