package com.plateer.ec1;

import com.plateer.ec1.pay.PaymentMethodEnum;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.factory.PaymentMethodFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentApplication {


    public static void main(String[] args) {

        PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();

        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentMethodEnum.INICIS);

        paymentMethodFactory.approve(payInfo);

    }
}
