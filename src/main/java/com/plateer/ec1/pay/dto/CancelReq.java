package com.plateer.ec1.pay.dto;

import com.plateer.ec1.pay.enums.PaymentType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancelReq {
    private PaymentType paymentType;
    private String ordNo;
}
