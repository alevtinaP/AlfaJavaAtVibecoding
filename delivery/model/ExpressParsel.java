package delivery.model;

public class ExpressParsel extends Parcel {
    private int deliveryHours;

    public ExpressParsel(String recipientName, String address, double weight, String trekNumber, int deliveryHours) {
        super(recipientName, address, weight, trekNumber);
        this.deliveryHours = deliveryHours;
    }

    public double calculateDeliveryPrice() {
        if (deliveryHours < 24) {
            return super.calculateDeliveryPrice() + 500;
        } else {
            return super.calculateDeliveryPrice();
        }
    }


    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline " + deliveryHours + " house");
    }


}
