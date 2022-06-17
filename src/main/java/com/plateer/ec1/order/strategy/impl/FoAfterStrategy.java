package com.plateer.ec1.order.strategy.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.strategy.AfterStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoAfterStrategy implements AfterStrategy {
    @Override
    public void call(OrderRequest orderRequest, OrderDto orderDto) {
        log.info("[FoAfterStrategy.call] - FO주문 후처리");
    }
}
