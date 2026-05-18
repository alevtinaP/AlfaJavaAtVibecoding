package delivery.app;

import delivery.model.ExpressParsel;
import delivery.model.FragileParcel;
import delivery.model.Parcel;
import delivery.service.ParcelService;

public class Main {
    static void main(String[] args) {
        Parcel regularParcel = new Parcel("Ivanov Ivan", "New York", 600, "BY123456");
        FragileParcel fragileParcel = new FragileParcel("Sidorov Ivan", "Moscow", 2000, "RU123456", false);
        ExpressParsel expressParsel = new ExpressParsel("Rozmos Sergey", "London", 600, "UA454564", 5);
        Parcel nullParcel = new Parcel();

        Parcel[] parsels = {
                regularParcel, fragileParcel, expressParsel, nullParcel
        };

        ParcelService service = new ParcelService();

        service.printParcelsReport(parsels);
    }
}


