public class Valet implements HotelService {
    @Override
    public String getServiceName() {
        return "Valet";
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("[Valet] Vehicle with plate number " + plateNumber
                + " is being brought to the entrance.");
    }
}
