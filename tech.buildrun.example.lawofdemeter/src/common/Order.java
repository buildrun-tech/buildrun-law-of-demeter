package common;

import java.time.LocalDate;

public class Order {

    private final Shipment shipment;

    public Order(Shipment shipment) {
        this.shipment = shipment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public LocalDate getDeliveryDate() {
        return this.getShipment()
                .getDeliveryDetail()
                .getDeliveryDate();
    }
}
