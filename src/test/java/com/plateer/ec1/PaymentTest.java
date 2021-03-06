package com.plateer.ec1;

import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.enums.PaymentType;
import com.plateer.ec1.pay.factory.PaymentFactory;
import com.plateer.ec1.pay.service.PaymentService;
import com.plateer.ec1.pay.service.PaymentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentTest {
    @Autowired
    private PaymentService paymentService;

    @Test
    @DisplayName("INICIS approve")
    void approve_inicis(){
        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentType.INICIS);
        paymentService.approve(payInfo);
    }
    @Test
    @DisplayName("POINT approve")
    void approve_point(){
        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentType.POINT);
        paymentService.approve(payInfo);
    }

    @Test
    @DisplayName("INICIS cancel")
    void cancel_inicis(){
        CancelReq cancelReq = new CancelReq();
        cancelReq.setPaymentType(PaymentType.INICIS);
        paymentService.cancel(cancelReq);
    }

    @Test
    @DisplayName("POINT cancel")
    void cancel_point(){
        CancelReq cancelReq = new CancelReq();
        cancelReq.setPaymentType(PaymentType.POINT);
        paymentService.cancel(cancelReq);
    }

    @Test
    @DisplayName("INICIS netCancel")
    void netCancel_inicis(){
        CancelReq cancelReq = new CancelReq();
        cancelReq.setPaymentType(PaymentType.INICIS);
        paymentService.netCancel(cancelReq);
    }

    @Test
    @DisplayName("POINT netCancel")
    void netCancel_point(){
        CancelReq cancelReq = new CancelReq();
        cancelReq.setPaymentType(PaymentType.POINT);
        paymentService.netCancel(cancelReq);
    }
}
