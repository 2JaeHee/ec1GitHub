package com.plateer.ec1.order.strategy.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.enums.OrderType;
import com.plateer.ec1.order.strategy.DataStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EcouponDataStrategy implements DataStrategy {
    @Override
    public OrderDto create(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("EcouponDataStrategy.create - ecoupon 주문 데이터 생성");
        return new OrderDto();
    }

    @Override
    public OrderType getType() {
        return OrderType.ECOUPON;
    }
}
