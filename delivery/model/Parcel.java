package delivery.model;

public class Parcel {

    private String recipientName;
    private String address;
    protected double weight;
    String trekNumber;

    public Parcel(String recipientName, String address, double weight, String trekNumber) {
        this.recipientName = recipientName;
        this.address = address;
        this.weight = weight;
        this.trekNumber = trekNumber;
    }

    public Parcel() {
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getAddress() {
        return address;
    }

    public double getWeight() {
        return weight;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateDeliveryPrice() {
        if (getWeight() == 0.0) {
            return 0.0;
        }
        return 100 + getWeight() * 30;
    }


    public void printInfo() {
        System.out.println("Информация о посылке:");
        System.out.println("Получатель: " + recipientName);
        System.out.println("Адрес доставки: " + address);
        System.out.println("Вес посылки: " + weight + " кг");
        System.out.println("Трек-номер: " + trekNumber);
        System.out.println("Стоимость доставки: " + calculateDeliveryPrice() + " руб.");
    }
}