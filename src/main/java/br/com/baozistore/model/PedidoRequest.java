package br.com.baozistore.model;

/**
 * Corpo JSON recebido no POST/PUT de /pedidos.
 * Exemplo: { "clienteId": 1, "produtoId": 1, "quantidade": 10 }
 */
public record PedidoRequest(Long clienteId, Long produtoId, Integer quantidade) {
}
