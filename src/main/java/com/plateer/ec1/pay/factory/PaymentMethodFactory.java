package com.plateer.ec1.pay.factory;

import com.plateer.ec1.pay.enums.PaymentMethod;
import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.impl.Inicis;
import com.plateer.ec1.pay.impl.Point;

public class PaymentMethodFactory implements PaymentFactory {
    @Override
    public ApproveResVO approve(PayInfo payInfo) {
        PaymentFactory paymentFactory = null;

        if(PaymentMethod.INICIS == payInfo.getPaymentType()){
            paymentFactory = new Inicis();
        } else if (PaymentMethod.POINT == payInfo.getPaymentType()) {
            paymentFactory = new Point();
        }
        return paymentFactory.approve(payInfo);
    }

    @Override
    public void cancel(CancelReq cancelReq) {
        PaymentFactory paymentFactory = null;

        if(PaymentMethod.INICIS == cancelReq.getPaymentType()){
            paymentFactory = new Inicis();
        } else if (PaymentMethod.POINT == cancelReq.getPaymentType()) {
            paymentFactory = new Point();
        }

        paymentFactory.cancel(cancelReq);
    }

}
