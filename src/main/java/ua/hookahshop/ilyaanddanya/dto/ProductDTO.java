package ua.hookahshop.ilyaanddanya.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private String name;
    private Short amount;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
