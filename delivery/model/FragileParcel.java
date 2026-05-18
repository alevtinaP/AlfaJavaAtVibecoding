package delivery.model;

public class FragileParcel extends Parcel {
    private boolean requiresCarefulHandling;

    public FragileParcel(String recipientName, String address, double weight, String trekNumber, boolean requiresCarefulHandling) {
        super(recipientName, address, weight, trekNumber);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    public double calculateDeliveryPrice() {
        if (requiresCarefulHandling) {
            return super.calculateDeliveryPrice() + 200;
        } else {
            return super.calculateDeliveryPrice();
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }


}
