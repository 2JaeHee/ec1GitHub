package com.plateer.ec1.pay.factory;

import com.plateer.ec1.pay.enums.PaymentType;
import com.plateer.ec1.pay.factory.impl.Inicis;
import com.plateer.ec1.pay.factory.impl.Point;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 구현 객체를 생성하는 역할을 하는 Factory
 */
@Slf4j
@Component
public class PaymentFactory {

    private Map<PaymentType, Payment> paymentMap = new HashMap<>();
    private final List<Payment> payments;


    public PaymentFactory(List<Payment> payments) {
        this.payments = payments;
        this.payments.forEach(c -> paymentMap.put(c.getType(), c));
    }

    public Payment getPaymentFactory(PaymentType paymentType) {
        log.info("----------- Payment : " + paymentMap.get(paymentType));
        return paymentMap.get(paymentType);
    }
}
