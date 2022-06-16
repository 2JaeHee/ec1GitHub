package com.plateer.ec1.pay.service;

import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.enums.PaymentType;
import com.plateer.ec1.pay.factory.PaymentAbstractFactory;
import com.plateer.ec1.pay.factory.PaymentFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentFactory paymentFactory;

    /**
     * 결제 승인
     * @param payInfo
     * @return ApproveResVO
     */
    @Override
    public ApproveResVO approve(PayInfo payInfo) {
        PaymentAbstractFactory factory = paymentFactory.getPaymentFactory(payInfo.getPaymentType());
        return factory.approve(new PayInfo());
    }

}
