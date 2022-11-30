package me.xamrah.abobusparkoop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "drivers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String secondName;
    private String passport;
    private String driverLicence;
    private LocalDateTime birthDate;
    @ManyToMany(targetEntity = Bus.class)
    private List<Bus> buses;

    public Driver(String lastName, String firstName, String secondName, LocalDateTime age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = age;
    }
}
