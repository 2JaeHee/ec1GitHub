package com.plateer.ec1.order.service;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;

public interface OrderService {
    OrderDto order(OrderRequest orderRequest);
}
