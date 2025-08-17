package desafio.itau.springboot.model;

import java.time.OffsetDateTime;

public class Transaction {
    private double valor;
    private OffsetDateTime dataHora;

    public Transaction(OffsetDateTime dataHora, double valor) {
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
