package com.plateer.ec1.order.service;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.enums.OrderValidator;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class OrderContext {

    public OrderDto excute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest) {
        OrderDto orderDto = new OrderDto();
        if (amountValidation(orderRequest.getOrderNo())) {
            //주문 데이터 생성
            orderDto = dataStrategy.create(orderRequest, new OrderProductView());
            //주문데이터 insert
            insertOrderData(orderDto);
            //주문 후처리
            afterStrategy.call(orderRequest, orderDto);


        }
        return orderDto;
    }

    private boolean amountValidation(String orderNo) {
        log.info("[OrderContext.amountValidation] 금액검증");
        return true;
    }

    private void insertOrderData(OrderDto orderDto) {
        log.info("[OrderContext.insertOrderData] 주문데이터 insert");
    }
}
