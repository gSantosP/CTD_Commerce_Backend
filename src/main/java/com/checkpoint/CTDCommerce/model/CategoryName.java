package com.checkpoint.CTDCommerce.model;

public enum CategoryName {
    ELETRONICS("Eletrônicos"),
    JEWELERY("Joalheria"),
    MENS_CLOTHING("Roupas Masculinas"),
    WOMENS_CLOTHING("Roupas Femininas");

    private String name;

    CategoryName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
