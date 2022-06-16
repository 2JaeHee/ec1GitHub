package com.plateer.ec1.pay.factory;

import com.plateer.ec1.pay.enums.PaymentType;
import com.plateer.ec1.pay.factory.impl.Inicis;
import com.plateer.ec1.pay.factory.impl.Point;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * 구현 객체를 생성하는 역할을 하는 Factory
 */
@Component
public class PaymentFactory {

    private final Map<PaymentType, Supplier<PaymentAbstractFactory>> paymentMap = new HashMap<>();

    public PaymentFactory(){
        this.paymentMap.put(PaymentType.INICIS, Inicis::new);
        this.paymentMap.put(PaymentType.POINT, Point::new);
    }

    public PaymentAbstractFactory getPaymentFactory(PaymentType paymentType) {
        return paymentMap.get(paymentType).get();
    }
}
