package springjpa.endpoints.model;

import java.util.UUID;

import javax.print.attribute.standard.DateTimeAtCompleted;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private UUID ID_Compra;

// ?    ID_Fornecedor (Chave Estrangeira referenciando Fornecedor)

private DateTimeAtCompleted Data_da_Compra
Total
}
