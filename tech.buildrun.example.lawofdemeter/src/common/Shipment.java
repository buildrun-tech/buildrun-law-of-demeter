package common;

import java.time.LocalDate;

public class Shipment {


    private final DeliveryDetail deliveryDetail;

    public Shipment(DeliveryDetail deliveryDetail) {
        this.deliveryDetail = deliveryDetail;
    }

    public DeliveryDetail getDeliveryDetail() {
        return deliveryDetail;
    }
}
