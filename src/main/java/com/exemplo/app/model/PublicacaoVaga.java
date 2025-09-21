package com.exemplo.app.model;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicacaoVaga {
    private LocalDate dataPublicacao;
    private LocalDate dataFim;
}