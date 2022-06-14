package com.plateer.ec1.pay.dto;

import com.plateer.ec1.pay.PaymentMethodEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancelReq {
    private PaymentMethodEnum paymentType;
    private String ordNo;
}
