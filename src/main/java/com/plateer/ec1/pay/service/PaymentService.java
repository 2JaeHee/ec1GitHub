package com.plateer.ec1.pay.service;

import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.PayInfo;

public interface PaymentService {
    ApproveResVO approve(PayInfo payInfo);
}
