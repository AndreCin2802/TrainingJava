package Atividades.pedidos.entities.enums;

public enum OrderStatus {


    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final Integer descricao;


    OrderStatus(Integer descricao) {
        this.descricao = descricao;
    }

    public int getDescricao() {
        return descricao;
    }


}
