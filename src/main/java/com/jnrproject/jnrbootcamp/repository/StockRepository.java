package com.jnrproject.jnrbootcamp.repository;

import com.jnrproject.jnrbootcamp.model.Stock;
import com.jnrproject.jnrbootcamp.model.dto.StockDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    Optional<Stock> findByNameAndData(String name, LocalDate data);

    @Query("SELECT stock " +
            "FROM Stock stock " +
            "WHERE stock.name = :name AND stock.data = :data AND stock.id <> :id")
    Optional<Stock> findByStockUpdate(String name, LocalDate data, Long id);

    @Query("SELECT stock " +
            "FROM Stock stock " +
            "WHERE stock.data = :data")
    Optional<List<Stock>> findBytoday(LocalDate data);
}
