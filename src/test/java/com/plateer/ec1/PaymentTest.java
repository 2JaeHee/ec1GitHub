package com.plateer.ec1;

import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.enums.PaymentType;
import com.plateer.ec1.pay.factory.PaymentFactory;
import com.plateer.ec1.pay.service.PaymentService;
import com.plateer.ec1.pay.service.PaymentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class PaymentTest {
    PaymentService paymentService;
    @BeforeEach
    public void beforeEach(){
        paymentService = new PaymentServiceImpl(new PaymentFactory());
    }
    @Test
    void approve(){
        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentType.INICIS);
        paymentService.approve(payInfo);

        payInfo.setPaymentType(PaymentType.POINT);
        paymentService.approve(payInfo);
    }
}
