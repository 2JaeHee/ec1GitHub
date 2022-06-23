package com.plateer.ec1.order.strategy;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.enums.SystemType;

public interface AfterStrategy {

    void call(OrderRequest orderRequest, OrderDto orderDto);

    SystemType getType();
}
