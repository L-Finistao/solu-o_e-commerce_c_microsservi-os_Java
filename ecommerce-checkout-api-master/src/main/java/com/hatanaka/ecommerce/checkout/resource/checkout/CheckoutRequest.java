package com.hatanaka.ecommerce.checkout.resource.checkout;

import lombok.Data;

import java.io.Serializable;

@Data
public class CheckoutRequest implements Serializable {
    private  String fistName;
    private  String lastName;
    private  String username;
    private  String email;
    private  String address;
    private  String complement;
    private  String country;
    private  String state;
    private  String cep;

    private  boolean saveAddress;
    private  boolean saveInfo;

    private  String paymentMethod;
    
    private  String CardName;
    private  String CardNunber;
    private  String CardData;
    private  String CardCvv;
}
