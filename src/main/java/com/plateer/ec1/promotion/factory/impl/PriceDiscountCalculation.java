package com.plateer.ec1.promotion.factory.impl;

import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseBaseVo;
import com.plateer.ec1.promotion.dto.ResponsePriceDcVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.Calculation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PriceDiscountCalculation implements Calculation {
    /**
     * 즉시할인가격 조회 (상품 행사가에 적용되는 가격할인 프로모션)
     * @param requestPromotionVo
     * @return
     */
    @Override
    public ResponsePriceDcVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        Promotion promotion = getAvailablePromotionData(requestPromotionVo);

        ResponsePriceDcVo responsePriceDcVo = calculateDcAmt(promotion);
        return responsePriceDcVo;
    }

    @Override
    public PromotionType getType() {
        return PromotionType.PRICE_DISCOUNT;
    }

    /**
     * 조회 된 프로모션 정보 계산 적용
     * @param promotion
     * @return ResponseBaseVo
     */
    private ResponsePriceDcVo calculateDcAmt(Promotion promotion) {
        log.info("[PriceDiscountCalculation.calculateDcAmt]");
        //조회 한 프로모션 정보로 상품 즉시할인 가격 계산
        log.info("조회 한 프로모션 정보로 상품 즉시할인 가격 계산");
        return new ResponsePriceDcVo();
    }
    /**
     * 가격할인 프로모션 정보 조회
     * @param requestPromotionVo
     * @return Promotion
     */
    private Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo){
        log.info("[PriceDiscountCalculation.getAvailablePromotionData]");
        //즉시할인 프로모션 정보 조회
        log.info("가격즉시할인 프로모션 정보 조회");
        return new Promotion();
    }
}
