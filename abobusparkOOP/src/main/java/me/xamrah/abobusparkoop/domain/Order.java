package me.xamrah.abobusparkoop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.xamrah.abobusparkoop.domain.OrderStatusType;
import me.xamrah.abobusparkoop.domain.PaymentType;
import me.xamrah.abobusparkoop.domain.Shift;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PaymentType type;
    private BigDecimal amount;
    @ManyToOne(targetEntity = Shift.class)
    private Shift shift;
    private LocalDateTime processingTime;
    private OrderStatusType orderStatusType;

    public Order(PaymentType type, BigDecimal amount, Shift shift, LocalDateTime processingTime, OrderStatusType orderStatusType){
        this.type = type;
        this.amount = amount;
        this.processingTime = processingTime;
        this.shift = shift;
        this.orderStatusType = orderStatusType;
    }
}
