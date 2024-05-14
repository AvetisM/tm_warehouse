package ru.avrm.tm_warehouse.repository;

import ru.avrm.tm_warehouse.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
