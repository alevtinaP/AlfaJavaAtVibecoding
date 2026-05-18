package delivery.service;

import delivery.model.Parcel;

public class ParcelService {
    public void printParcelsReport(Parcel[] parcels) {

        for //(Parcel parcel : parcels) {
        (int i = 0; i < parcels.length; i++) {
            Parcel parcel = parcels[i];
            if (parcel!= null) {
                parcel.printInfo();
                System.out.println("Общая стоимость доставки: " + parcel.calculateDeliveryPrice() + " руб");
                System.out.println();
            }
        }
    }
}
