package ru.avrm.tm_warehouse.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avrm.tm_warehouse.domain.Item;
import ru.avrm.tm_warehouse.service.ItemService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/items")
public class ItemsController {

    private ItemService itemService;

    @GetMapping("/all")
    public ResponseEntity<List<Item>> findAll() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(itemService.findAll());
    }
}
