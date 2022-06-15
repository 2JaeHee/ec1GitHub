package com.plateer.ec1;

import com.plateer.ec1.pay.enums.PaymentMethod;
import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.factory.PaymentMethodFactory;

public class PaymentApplication {


    public static void main(String[] args) {

        PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();

        PayInfo payInfo = new PayInfo();
        payInfo.setPaymentType(PaymentMethod.INICIS);

        paymentMethodFactory.approve(payInfo);

        CancelReq cancelReq = new CancelReq();
        //cancelReq.setPaymentType(PaymentMethodEnum.POINT);
        paymentMethodFactory.cancel(cancelReq);

    }
}
