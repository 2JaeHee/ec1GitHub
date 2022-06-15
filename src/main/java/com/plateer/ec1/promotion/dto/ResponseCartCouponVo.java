package com.plateer.ec1.promotion.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseCartCouponVo extends ResponseBaseVo {

    private List<Product> productList;
}
