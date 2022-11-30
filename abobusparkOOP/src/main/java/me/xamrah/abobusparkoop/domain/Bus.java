package me.xamrah.abobusparkoop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.xamrah.abobusparkoop.domain.Driver;
import me.xamrah.abobusparkoop.domain.Route;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private String model;
    private String licencePlate;
    @ManyToMany(targetEntity = Driver.class)
    private List<Driver> drivers;
    @ManyToOne(targetEntity = Route.class)
    private Route route;

    public Bus(String label, String model, String licencePlate){
        this.label = label;
        this.model = model;
        this.licencePlate = licencePlate;
    }
}
