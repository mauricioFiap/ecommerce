package br.com.fiap.gestaoitens.service;

import br.com.fiap.gestaoitens.entity.Item;
import br.com.fiap.gestaoitens.repository.ItemRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> listarTodos() {
        return itemRepository.findAll();
    }

    public Item salvar(Item item) {
        // Validações e lógica de negócios
        return itemRepository.save(item);
    }

    public Item atualizar(Long id, Item item) {
        // Validações e lógica de negócios
        return itemRepository.save(item);
    }

    public void remover(Long id) {
        itemRepository.deleteById(id);
    }
}
