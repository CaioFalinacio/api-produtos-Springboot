package com.exemplo.app.model;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;
    private double valorPago;
    private LocalDate dataPagamento;
    private enum Status { PENDENTE, PAGO, CANCELADO };
    private String metodoTransferencia;
}