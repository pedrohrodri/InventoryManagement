package br.com.pedro.inventorymanagement.category;

import br.com.pedro.inventorymanagement.core.utils.UUIDUtils;

public class Category {

    private final String id = UUIDUtils.genId();
    private String name;
    private CategoryType type;
    private Boolean active;

}
