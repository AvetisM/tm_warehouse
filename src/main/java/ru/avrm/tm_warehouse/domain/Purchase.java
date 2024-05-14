package ru.avrm.tm_warehouse.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.avrm.tm_warehouse.validation.Operation;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "purchase")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Purchase {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Min(value = 1, message = "Id must be non null and more then 0",
            groups = {Operation.OnUpdate.class})
    private long id;
    @NotBlank(message = "Date must be not empty", groups = {Operation.OnUpdate.class})
    private Timestamp date;
    private String description;
    private BigDecimal amount;
    @OneToMany(mappedBy = "purchase", fetch = FetchType.LAZY)
    private List<PurchaseItems> purchaseItems;
}
