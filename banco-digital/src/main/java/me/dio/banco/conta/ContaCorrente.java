package me.dio.banco.conta;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import me.dio.banco.Cliente;

@Slf4j
public class ContaCorrente extends Conta {

    private static final BigDecimal TAXA_MANUTENCAO = new BigDecimal("10.00");  // R$10 por mes.

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        log.info("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    public void aplicarTaxaDeManutencao() {
        if (saldo.compareTo(TAXA_MANUTENCAO) >= 0) {
            saldo = saldo.subtract(TAXA_MANUTENCAO);
            log.info("Taxa de manutenção aplicada: {}. Novo saldo: {}", TAXA_MANUTENCAO, saldo);
        } else {
            log.warn("Saldo insuficiente para aplicar a taxa de manutenção.");
        }
    }
}
