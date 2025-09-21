package com.exemplo.app.model;

package com.exemplo.app.model;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;
    private double salario;
    private LocalDate admissao;
}