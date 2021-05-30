package com.jnrproject.jnrbootcamp.mapper;

import com.jnrproject.jnrbootcamp.model.Stock;
import com.jnrproject.jnrbootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

        public Stock toEntity(StockDTO dto) {

            Stock stock = new Stock();
            stock.setId(dto.getId());
            stock.setName(dto.getName());
            stock.setPrice(dto.getPrice());
            stock.setVariation(dto.getVariation());
            stock.setData(dto.getData());
            return stock;
    }

    public StockDTO toDto(Stock stock) {
            StockDTO dto = new StockDTO();
            dto.setId(stock.getId());
            dto.setName(stock.getName());
            dto.setPrice(stock.getPrice());
            dto.setVariation(stock.getVariation());
            dto.setData(stock.getData());

            return dto;
    }

    public List<StockDTO> toDto(List<Stock> listStock) {
            return listStock.stream().map(this::toDto).collect(Collectors.toList());

    }
}
