package com.plateer.ec1.order.service;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.enums.OrderType;
import com.plateer.ec1.order.enums.OrderValidator;
import com.plateer.ec1.order.enums.SystemType;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import com.plateer.ec1.order.strategy.impl.BoAfterStrategy;
import com.plateer.ec1.order.strategy.impl.EcouponDataStrategy;
import com.plateer.ec1.order.strategy.impl.FoAfterStrategy;
import com.plateer.ec1.order.strategy.impl.GeneralDataStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderContext orderContext;
    private final Map<OrderType, Supplier<DataStrategy>> dataStrategyMap = new HashMap<>();
    private final Map<SystemType, Supplier<AfterStrategy>> afterStrategyMap = new HashMap<>();

    public OrderServiceImpl(OrderContext orderContext) {
        this.orderContext = orderContext;
        this.dataStrategyMap.put(OrderType.GENERAL, GeneralDataStrategy::new);
        this.dataStrategyMap.put(OrderType.ECOUPON, EcouponDataStrategy::new);

        this.afterStrategyMap.put(SystemType.BO, BoAfterStrategy::new);
        this.afterStrategyMap.put(SystemType.FO, FoAfterStrategy::new);
    }
    @Override
    public OrderDto order(OrderRequest orderRequest) {
        //OrderValidator.BO_GENERAL.getValidationDtoPredicate().test(new OrderValidationDto());
        DataStrategy dataStrategy = getDataStrategy(orderRequest);
        AfterStrategy afterStrategy = getAfterStrategy(orderRequest);
        return orderContext.excute(dataStrategy, afterStrategy, orderRequest);
    }

    private DataStrategy getDataStrategy(OrderRequest orderRequest) {
        return dataStrategyMap.get(orderRequest.getOrderType()).get();
    }

    private AfterStrategy getAfterStrategy(OrderRequest orderRequest) {
        return afterStrategyMap.get(orderRequest.getSystemType()).get();
    }

}
