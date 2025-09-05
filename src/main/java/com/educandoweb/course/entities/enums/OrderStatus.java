package com.educandoweb.course.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    //atributo para armazenar o código inteiro correspondente a cada status
    private int code;

    //construtor para inicializar o atributo code
    //o construtor é private porque só deve ser usado dentro do enum
    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    //método estático para converter um código inteiro em um valor do enum OrderStatus
    public static OrderStatus valueOf(int code) {
        //percorrer todos os valores do enum
        for (OrderStatus value : OrderStatus.values()) {
            //se o código do valor atual for igual ao código fornecido, 
            //retorna esse valor
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
    
    
}
