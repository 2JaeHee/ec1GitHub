package com.plateer.ec1.pay.factory.impl;

import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.enums.PaymentType;
import com.plateer.ec1.pay.factory.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Point implements Payment {
    private final String Y = "Y";
    @Override
    public ApproveResVO approve(PayInfo payInfo) {

        //포인트사용
        log.info("[Point.approve] Point 사용");

        //사용후 결과값 공통 res로 변경
        return ApproveResVO.builder().resultCd(Y).build();
    }

    @Override
    public void cancel(CancelReq cancelReq) {
        //포인트취소
        log.info("[Point.cancel] Point 취소");
    }

    @Override
    public void netCancel(CancelReq cancelReq) {
        //망취소
        log.info("[Point.netCancel] Point 망취소");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.POINT;
    }
}
