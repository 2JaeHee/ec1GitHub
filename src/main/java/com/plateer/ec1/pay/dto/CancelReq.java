package com.plateer.ec1.pay.dto;

import com.plateer.ec1.pay.enums.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancelReq {
    private PaymentMethod paymentType;
    private String ordNo;
}
