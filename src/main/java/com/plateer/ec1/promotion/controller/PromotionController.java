package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.CalculationFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PromotionController<T extends ResponseBaseVo> {

    private final CalculationFactory calculationFactory;

    public T getPromotionApplyData(RequestPromotionVo requestPromotionVo, PromotionType promotionType){
        return (T) calculationFactory.getPromotionCalculationData(requestPromotionVo, promotionType);
    }
}
