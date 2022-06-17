package com.plateer.ec1;

import com.plateer.ec1.order.controller.OrderController;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.enums.OrderType;
import com.plateer.ec1.order.enums.SystemType;
import com.plateer.ec1.order.service.OrderContext;
import com.plateer.ec1.order.service.OrderServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderTest {
    private OrderController orderController;

    @BeforeEach
    public void beforeEach(){
        orderController = new OrderController(new OrderServiceImpl(new OrderContext()));
    }

    @Test
    @DisplayName("BO general order")
    void generalOrderBo(){
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderType(OrderType.GENERAL);
        orderRequest.setSystemType(SystemType.BO);
        orderController.order(orderRequest);
    }

    @Test
    @DisplayName("FO general order")
    void generalOrderFo(){
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderType(OrderType.GENERAL);
        orderRequest.setSystemType(SystemType.FO);
        orderController.order(orderRequest);
    }

    @Test
    @DisplayName("BO ecoupon order")
    void ecouponOrderBo() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderType(OrderType.ECOUPON);
        orderRequest.setSystemType(SystemType.BO);
        orderController.order(orderRequest);
    }

    @Test
    @DisplayName("FO ecoupon order")
    void ecouponOrderFo(){
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderType(OrderType.ECOUPON);
        orderRequest.setSystemType(SystemType.FO);
        orderController.order(orderRequest);
    }
}
