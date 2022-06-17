package com.plateer.ec1;

import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.enums.PaymentType;
import com.plateer.ec1.pay.factory.PaymentFactory;
import com.plateer.ec1.pay.service.PaymentService;
import com.plateer.ec1.pay.service.PaymentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class PaymentTest {
    private PaymentService paymentService;

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

    @Test
    void cancel(){
        CancelReq cancelReq = new CancelReq();
        cancelReq.setPaymentType(PaymentType.INICIS);
        paymentService.cancel(cancelReq);

        cancelReq.setPaymentType(PaymentType.POINT);
        paymentService.cancel(cancelReq);
    }

    @Test
    void netCancel(){
        CancelReq cancelReq = new CancelReq();
        cancelReq.setPaymentType(PaymentType.INICIS);
        paymentService.netCancel(cancelReq);

        cancelReq.setPaymentType(PaymentType.POINT);
        paymentService.netCancel(cancelReq);
    }
}
