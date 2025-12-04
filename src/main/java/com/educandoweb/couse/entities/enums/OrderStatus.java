package com.educandoweb.couse.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int code;

    //construtor para o código
    private OrderStatus(int code) {
        this.code = code;
    }
    //método para retornar code

    public int getCode() {
        return code;
    }

    //método estático para percorrer o valor do code status
    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code ");
    }
}