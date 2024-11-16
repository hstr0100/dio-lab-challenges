package me.dio.banco;

import me.dio.banco.conta.Conta;
import java.util.List;
import lombok.Data;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;

}
