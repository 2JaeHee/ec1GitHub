package com.plateer.ec1.pay.factory;

import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;

public interface PaymentAbstractFactory {

    ApproveResVO approve(PayInfo payInfo);

    void cancel(CancelReq cancelReq);
}
