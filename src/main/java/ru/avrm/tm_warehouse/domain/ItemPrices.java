package ru.avrm.tm_warehouse.domain;

import lombok.*;
import ru.avrm.tm_warehouse.validation.Operation;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity(name = "item_prices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ItemPrices {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Min(value = 1, message = "Id must be non null and more then 0",
            groups = {Operation.OnUpdate.class})
    private int id;
    private Timestamp period;
    private BigDecimal price;
    @JoinColumn(name = "item_id")
    private int itemId;
    @JoinColumn(name = "price_type_id")
    private int priceTypeId;
}
