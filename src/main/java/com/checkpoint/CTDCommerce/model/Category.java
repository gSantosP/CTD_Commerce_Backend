package com.checkpoint.CTDCommerce.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="categories", uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


