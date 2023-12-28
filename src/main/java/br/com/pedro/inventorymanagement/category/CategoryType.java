package br.com.pedro.inventorymanagement.category;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CategoryType {

    NORMAL("Normal"),
    SPECIAL("Especial"),
    CUSTOM("Personalizada");

    private final String name;

}
