package ru.avrm.tm_warehouse.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avrm.tm_warehouse.domain.Item;
import ru.avrm.tm_warehouse.service.ItemService;

import javax.validation.Valid;
import java.sql.SQLException;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/item")
public class ItemController {

    private ItemService itemService;

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<Item> save(@Valid @RequestBody Item item) throws SQLException {
        return new ResponseEntity<>(
                itemService
                        .save(item)
                        .orElseThrow(() -> new SQLException("An error occurred while saving data")),
                HttpStatus.CREATED
        );
    }

}
