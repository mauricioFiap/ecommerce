package br.com.fiap.gestaoitens.repository;

import br.com.fiap.gestaoitens.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
