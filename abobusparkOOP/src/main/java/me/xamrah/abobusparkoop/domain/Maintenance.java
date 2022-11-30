package me.xamrah.abobusparkoop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.xamrah.abobusparkoop.domain.MaintenanceType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "maintenances")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    @ManyToOne(targetEntity = Bus.class)
    private Bus bus;
    private String description;
    private LocalDateTime processingTime;
    private MaintenanceType maintenanceType;

    public Maintenance(Bus bus, BigDecimal amount, LocalDateTime processingTime, MaintenanceType maintenanceType, String description) {
       this.amount = amount;
       this.bus = bus;
       this.processingTime = processingTime;
       this.maintenanceType = maintenanceType;
       this.description = description;
    }
}
