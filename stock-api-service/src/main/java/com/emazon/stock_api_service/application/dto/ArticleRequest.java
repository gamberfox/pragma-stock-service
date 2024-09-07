package com.emazon.stock_api_service.application.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import static com.emazon.stock_api_service.util.ArticleConstants.*;

@Getter
@Setter
public class ArticleRequest {
    private String name;
    private String description;
    private Long stock;
    private BigDecimal price;
    private Long brandId;
    private List<Long> categoryIds;
}
