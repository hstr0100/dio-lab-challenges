package me.dio.banco;

import me.dio.banco.conta.ContaPoupanca;
import me.dio.banco.conta.ContaCorrente;
import me.dio.banco.conta.Conta;
import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(new BigDecimal(100));
        cc.transferir(new BigDecimal(70), poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        ((ContaCorrente)cc).aplicarTaxaDeManutencao();
        ((ContaPoupanca)poupanca).aplicarJuros();
    }

}
