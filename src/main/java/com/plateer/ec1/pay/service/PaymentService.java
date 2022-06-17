package com.plateer.ec1.pay.service;

import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;

public interface PaymentService {
    ApproveResVO approve(PayInfo payInfo);

    void cancel(CancelReq cancelReq);

    void netCancel(CancelReq cancelReq);
}
