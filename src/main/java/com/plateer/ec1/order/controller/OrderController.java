package com.plateer.ec1.order.controller;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.enums.OrderType;
import com.plateer.ec1.order.enums.SystemType;
import com.plateer.ec1.order.service.OrderService;
import com.plateer.ec1.pay.dto.PayInfo;
import com.plateer.ec1.pay.enums.PaymentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    public OrderDto order(OrderRequest orderRequest) {
        //주문파라미터 데이터
//        orderRequest.setOrderType(OrderType.GENERAL);
//        orderRequest.setSystemType(SystemType.BO);
        //결제인증정보
        //결제 test 정보
//        PayInfo payInfo = new PayInfo();
//        payInfo.setPaymentType(PaymentType.INICIS);
//        orderRequest.setPayInfo(payInfo);

        return orderService.order(orderRequest);
    }
}
