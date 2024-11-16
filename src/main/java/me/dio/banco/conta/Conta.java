package me.dio.banco.conta;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import me.dio.banco.Cliente;

@Slf4j
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    @Getter
    protected int agencia;
    @Getter
    protected int numero;
    @Getter
    protected BigDecimal saldo;
    @Getter
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = BigDecimal.ZERO;
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor de saque deve ser positivo.");
        }

        if (saldo.compareTo(valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para o saque.");
        }

        saldo = saldo.subtract(valor);
    }

    @Override
    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor de depósito deve ser positivo.");
        }

        saldo = saldo.add(valor);
    }

    @Override
    public void transferir(BigDecimal valor, IConta contaDestino) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor da transferência deve ser positivo.");
        }

        this.sacar(valor);

        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        log.info("Titular: {}", this.cliente.getNome());
        log.info("Agencia: {}", this.agencia);
        log.info("Numero: {}", this.numero);
        log.info("Saldo: {}", this.saldo);
    }
}
