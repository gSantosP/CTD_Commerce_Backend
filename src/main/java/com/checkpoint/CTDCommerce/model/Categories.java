package com.checkpoint.CTDCommerce.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private NameCategories name;

    public Categories() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NameCategories getName() {
        return name;
    }

    public void setName(NameCategories name) {
        this.name = name;
    }

}
