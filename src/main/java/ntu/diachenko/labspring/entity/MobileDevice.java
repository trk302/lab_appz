package ntu.diachenko.labspring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MobileDevice")
@Entity
public class MobileDevice {

    @Id
    private Integer id;

    private String brand;

    private String model;

    private Double price;

    @Column(name = "operatingSystem")
    private String operatingSystem;
}