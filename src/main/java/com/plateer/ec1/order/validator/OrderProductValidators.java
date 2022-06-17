package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class OrderProductValidators {
    public static Predicate<OrderValidationDto> validateMaxPurchaseCount(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("[OrderProductValidators] 주문 상품 validation");
        return (OrderRequest) -> orderRequest != null;
    }
}
