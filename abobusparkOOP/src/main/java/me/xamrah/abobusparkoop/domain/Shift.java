package me.xamrah.abobusparkoop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.xamrah.abobusparkoop.domain.Driver;
import me.xamrah.abobusparkoop.domain.ShiftStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shifts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startTimeShift;
    private LocalDateTime endTimeShift;
    private ShiftStatus shiftStatus;
    @ManyToOne(targetEntity = Bus.class)
    private Bus bus;
    @ManyToOne(targetEntity = Driver.class)
    private Driver driver;

    public Shift(LocalDateTime startTimeShift, ShiftStatus shiftStatus, Bus bus, Driver driver) {
        this.startTimeShift = startTimeShift;
        this.shiftStatus = shiftStatus;
        this.bus = bus;
        this.driver = driver;
    }
}
