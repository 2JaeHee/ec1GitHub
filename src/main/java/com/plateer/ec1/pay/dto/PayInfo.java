package com.plateer.ec1.pay.dto;

import com.plateer.ec1.pay.enums.PaymentType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayInfo {
    private PaymentType paymentType;
    private String ordNo;
    private String prdNo;
    private String prdNm;
}
