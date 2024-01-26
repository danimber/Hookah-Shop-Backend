package ua.hookahshop.ilyaanddanya.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private String name;
    private Short amount;
    private Long categoryId;
    private String imgHref;
    private Short price;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", categoryId=" + categoryId +
                ", imgHref='" + imgHref + '\'' +
                ", price=" + price +
                '}';
    }
}
