package com.plateer.ec1.promotion.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponsePriceDcVo extends ResponseBaseVo {
    private List<Product> productList;
}
