package ru.avrm.tm_warehouse.domain;

import lombok.*;
import ru.avrm.tm_warehouse.validation.Operation;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "price_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PriceType {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull @Min(value = 1, message = "Id must be non null and more then 0",
            groups = {Operation.OnUpdate.class})
    private int id;
    @NotBlank(message = "Price type name must be not empty", groups = {Operation.OnCreate.class,
            Operation.OnUpdate.class})
    private String name;
    @NotBlank(message = "Code must be not empty", groups = {Operation.OnCreate.class,
            Operation.OnUpdate.class})
    private String code;
}
