package ua.hookahshop.ilyaanddanya.dto;

import lombok.Data;

@Data
public class CategoryDTO {

    private String name;

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
