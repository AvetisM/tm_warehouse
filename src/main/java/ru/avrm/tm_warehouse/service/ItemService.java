package ru.avrm.tm_warehouse.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import ru.avrm.tm_warehouse.domain.Item;
import ru.avrm.tm_warehouse.repository.ItemRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private static final Logger LOG = LoggerFactory.getLogger(ItemService.class.getName());

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Optional<Item> save(Item item) {
        Optional<Item> newItem = Optional.empty();
        try {
            newItem = Optional.of(itemRepository.save(item));
        } catch (DataIntegrityViolationException e) {
            LOG.error("Error!", e);
        }
        return newItem;
    }
}
