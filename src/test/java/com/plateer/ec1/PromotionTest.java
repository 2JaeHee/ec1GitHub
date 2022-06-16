package com.plateer.ec1;

import com.plateer.ec1.promotion.controller.PromotionController;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.Calculation;
import com.plateer.ec1.promotion.factory.impl.CartCouponCalculation;
import com.plateer.ec1.promotion.factory.impl.PriceDiscountCalculation;
import com.plateer.ec1.promotion.factory.impl.ProductCouponCalculation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PromotionTest<T extends ResponseBaseVo> {
    @Autowired
    private PromotionController promotionController;
    @Test
    void priceDiscount(){
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        Calculation calculation = new PriceDiscountCalculation();
        calculation.getCalculationData(requestPromotionVo);
    }

    @Test
    void productCoupon(){
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        Calculation calculation = new ProductCouponCalculation();
        calculation.getCalculationData(requestPromotionVo);
    }

    @Test
    void cartCoupon(){
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        Calculation calculation = new CartCouponCalculation();
        calculation.getCalculationData(requestPromotionVo);
    }
    @Test
    void test(){
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        promotionController.getPromotionApplyData(requestPromotionVo, PromotionType.PRODUCT_COUPON);
    }

}
