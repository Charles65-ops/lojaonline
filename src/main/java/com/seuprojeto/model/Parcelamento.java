package com.seuprojeto.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parcelamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroParcelas;
    private BigDecimal valorParcela;

    @OneToOne
    private Pagamento pagamento;
}
