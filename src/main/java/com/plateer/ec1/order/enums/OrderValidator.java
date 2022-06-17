package com.plateer.ec1.order.enums;

import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.validator.OrderCommonValidators;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

@RequiredArgsConstructor
public enum OrderValidator {
    FO_GENERAL(SystemType.FO, OrderType.GENERAL, OrderCommonValidators.isSellingProduct),
    BO_GENERAL(SystemType.BO, OrderType.GENERAL, OrderCommonValidators.isSellingProduct),
    FO_ECOUPON(SystemType.FO, OrderType.ECOUPON, OrderCommonValidators.isSellingProduct),
    BO_ECOUPON(SystemType.BO, OrderType.ECOUPON, OrderCommonValidators.isSellingProduct),
    ;

    @Getter
    private final SystemType systemType;
    @Getter
    private final OrderType orderType;
    @Getter
    private final Predicate<OrderValidationDto> validationDtoPredicate;

}
