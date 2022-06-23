package com.plateer.ec1.pay.factory;

import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.enums.PaymentType;

public interface Payment {

    ApproveResVO approve(PayInfo payInfo);

    void cancel(CancelReq cancelReq);

    void netCancel(CancelReq cancelReq);

    PaymentType getType();
}
