package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class OrderCommonValidators {

    public static Predicate<OrderValidationDto> isSellingProduct = (orderRequest) -> {
        log.info("[OrderProductValidators] 주문 공통 validation");
        return orderRequest != null;
    };
}
