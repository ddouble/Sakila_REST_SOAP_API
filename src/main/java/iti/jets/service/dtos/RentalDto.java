package iti.jets.service.dtos;

import iti.jets.database.entities.Rental;
import iti.jets.database.entities.Staff;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * A DTO for the {@link Rental} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalDto implements Serializable {
    private Integer id;
    @NotNull
    private Instant rentalDate;
    @NotNull
    private InventoryDto inventory;
    @NotNull
    private CustomerDto customer;
    private Instant returnDate;
    @NotNull
    private StaffDto staff;
    @NotNull
    private Instant lastUpdate;
    private List<PaymentDto> paymentList;
}