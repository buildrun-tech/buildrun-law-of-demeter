package common;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OrderFactory {

    public static Order build() {
        var deliveryDate =
                LocalDate.now()
                        .plus(7, ChronoUnit.DAYS);

        var deliveryDetail = new DeliveryDetail(
                deliveryDate
        );

        var shipment =
                new Shipment(deliveryDetail);

        return new Order(shipment);
    }
}
