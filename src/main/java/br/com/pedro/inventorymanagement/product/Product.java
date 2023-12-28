package br.com.pedro.inventorymanagement.product;

import br.com.pedro.inventorymanagement.category.Category;
import br.com.pedro.inventorymanagement.core.utils.UUIDUtils;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Product {

    private final String id = UUIDUtils.genId();
    private String name;
    private String identifier;
    private Integer stockQuantity;
    // TODO -> VALIDAR NECESSIDADE DE USAR MONETARY VALUE
    private BigDecimal costValue;
    private BigDecimal costSale;
    private Category category;
    // TODO -> VALIDAR NECESSIDADE DE LIB OU ENUM
    private String icms;
    // TODO -> VALIDAR COMO ARMAZENAR IMAGEM NO BANCO DE DADOS
    private Object productImage;
    private final LocalDate registrationDate = LocalDate.now();
    private Boolean active;

}