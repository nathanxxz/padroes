package controller;

import service.ServicoPagamento;

public class Checkout {

    private ServicoPagamento servicoPagamento;

    public Checkout(ServicoPagamento servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void setMetodoPagamento(ServicoPagamento servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void setMetodo(ServicoPagamento servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void finalizarCompra(double valor) {
        servicoPagamento.pagar(valor);
    }

    public void finalizarPagamento(double valor) {
        finalizarCompra(valor);
    }
}

