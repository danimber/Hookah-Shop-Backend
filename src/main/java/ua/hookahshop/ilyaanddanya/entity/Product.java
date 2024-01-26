package ua.hookahshop.ilyaanddanya.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Short amount;
    private Short price;
    private String imgHref;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
