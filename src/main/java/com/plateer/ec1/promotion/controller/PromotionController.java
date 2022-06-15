package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.CalculationFactory;
import org.springframework.stereotype.Controller;

@Controller
public class PromotionController<T extends ResponseBaseVo> {

    public T getPromotionApplyData(RequestPromotionVo requestPromotionVo, PromotionType promotionType){
        CalculationFactory calculationFactory = new CalculationFactory();
        return (T) calculationFactory.getPromotionCalculationData(requestPromotionVo, promotionType);
    }
}
