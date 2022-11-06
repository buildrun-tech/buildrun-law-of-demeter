package common;

import java.time.LocalDate;

public class DeliveryDetail {

    private final LocalDate deliveryDate;

    public DeliveryDetail(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
