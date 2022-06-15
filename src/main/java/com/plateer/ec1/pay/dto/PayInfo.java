package com.plateer.ec1.pay.dto;

import com.plateer.ec1.pay.enums.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayInfo {
    private PaymentMethod paymentType;
    private String ordNo;
    private String prdNo;
    private String prdNm;
}
