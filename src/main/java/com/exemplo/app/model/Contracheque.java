package com.exemplo.app.model;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contracheque{
    private double salarioBruto;
    private double salarioLiquido;
    private double descontosTotais;
    private double proventosTotais;
    private LocalDate dataEmissao;
}