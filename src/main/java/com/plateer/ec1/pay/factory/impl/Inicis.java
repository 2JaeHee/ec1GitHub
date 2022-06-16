package com.plateer.ec1.pay.factory.impl;

import com.plateer.ec1.pay.dto.ApproveResVO;
import com.plateer.ec1.pay.dto.CancelReq;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.dto.inicis.InicisApproveReq;
import com.plateer.ec1.pay.dto.inicis.InicisApproveRes;
import com.plateer.ec1.pay.dto.inicis.InicisCancelReq;
import com.plateer.ec1.pay.dto.inicis.InicisCancelRes;
import com.plateer.ec1.pay.factory.PaymentAbstractFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Inicis implements PaymentAbstractFactory {
    @Override
    public ApproveResVO approve(PayInfo payInfo) {
        log.info("[Inicis.approve] Inicis 승인");
        //가상계좌 채번
        InicisApproveRes inicisApproveRes = inicisApproveCall(InicisApproveReq.build(payInfo));
        return InicisApproveRes.build(inicisApproveRes);
    }

    @Override
    public void cancel(CancelReq cancelReq) {
        //환불요청
        InicisCancelReq inicisCancelReq = new InicisCancelReq();

        inicisCancelCall(inicisCancelReq);
        //입금완료처리 ?

    }

    private InicisApproveRes inicisApproveCall(InicisApproveReq req){
        //외부인터페이스 사용 시 로그추가
        log.info("[Inicis.approve] api call");

        InicisApproveRes res = new InicisApproveRes();
        //외부인터페이스 사용 후 로그에 결과값 업데이트
        return res;
    }

    private InicisCancelRes inicisCancelCall(InicisCancelReq inicisCancelReq){
        //외부인터페이스 사용 시 로그추가
        log.info("[Inicis.cancel] api call");
        InicisCancelRes res = new InicisCancelRes();
        //외부인터페이스 사용 후 로그에 결과값 업데이트
        return res;
    }

}