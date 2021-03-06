package com.plateer.ec1.order.dto;

import com.plateer.ec1.order.enums.OrderType;
import com.plateer.ec1.order.enums.SystemType;
import com.plateer.ec1.pay.dto.PayInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private String orderNo;
    private SystemType systemType;
    private OrderType orderType;

    private PayInfo payInfo;
}
