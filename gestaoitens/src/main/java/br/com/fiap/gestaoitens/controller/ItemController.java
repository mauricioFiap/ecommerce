package br.com.fiap.gestaoitens.controller;

import br.com.fiap.gestaoitens.entity.Item;
import br.com.fiap.gestaoitens.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> listarTodos() {
        return ResponseEntity.ok(itemService.listarTodos());
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Item> criar(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.salvar(item), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Item> atualizar(@PathVariable Long id, @RequestBody Item item) {
        return ResponseEntity.ok(itemService.atualizar(id, item));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        itemService.remover(id);
        return ResponseEntity.noContent().build();
    }
}