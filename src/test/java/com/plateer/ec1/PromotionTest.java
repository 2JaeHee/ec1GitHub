package com.plateer.ec1;

import com.plateer.ec1.promotion.controller.PromotionController;
import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.Calculation;
import com.plateer.ec1.promotion.factory.CartCouponCalculation;
import com.plateer.ec1.promotion.factory.PriceDiscountCalculation;
import com.plateer.ec1.promotion.factory.ProductCouponCalculation;
import org.junit.jupiter.api.Test;

public class PromotionTest<T extends ResponseBaseVo> {

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
        PromotionController promotionController = new PromotionController();
        promotionController.getPromotionApplyData(new RequestPromotionVo(), PromotionType.PRODUCT_COUPON);
    }
}
