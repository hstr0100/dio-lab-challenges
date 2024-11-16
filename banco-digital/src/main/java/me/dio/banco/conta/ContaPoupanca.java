package me.dio.banco.conta;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import me.dio.banco.Cliente;

@Slf4j
public class ContaPoupanca extends Conta {

    private static final BigDecimal SAQUE_MAXIMO = new BigDecimal("1000.00");
    private static final BigDecimal JUROS_MENSAL = new BigDecimal("0.05");  // 5% ao mes, banco generoso esse nosso.

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(BigDecimal valor) {
        // Limite apenas para contas poupanca
        if (valor.compareTo(SAQUE_MAXIMO) > 0) {
            log.error("O valor de saque excede o limite máximo. Valor solicitado: {}, Limite máximo: {}", valor, SAQUE_MAXIMO);
            throw new IllegalArgumentException("Saque excede o limite máximo permitido.");
        }

        super.sacar(valor);
        log.info("Saque realizado com sucesso. Valor: {}. Saldo atual: {}", valor, saldo);
    }

    @Override
    public void imprimirExtrato() {
        log.info("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public void aplicarJuros() {
        BigDecimal juros = saldo.multiply(JUROS_MENSAL);
        saldo = saldo.add(juros);
        log.info("Juros aplicados: {}. Novo saldo: {}", juros, saldo);
    }
}
