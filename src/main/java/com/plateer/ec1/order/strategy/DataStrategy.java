package com.plateer.ec1.order.strategy;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.enums.OrderType;

public interface DataStrategy {

    OrderDto create(OrderRequest orderRequest, OrderProductView orderProductView);

    OrderType getType();
}
