package iti.jets.service.dtos;

import iti.jets.database.entities.Country;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * A DTO for the {@link Country} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto implements Serializable {

    private Integer id;
    @Size(max = 50)
    @NotNull
    private String country;
    @NotNull
    private Instant lastUpdate;
    private List<CityDto> cityList;

}