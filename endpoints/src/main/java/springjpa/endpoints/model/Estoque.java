package springjpa.endpoints.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estoque")
@Getter
@Setter
@Data
public class Estoque {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID ID_Estoque;
  // ID_Produto (Chave Estrangeira referenciando Produto)

  @NotEmpty(message = "digita quantidade")
  private int Quantidade;

}
