package com.plateer.ec1;

import com.plateer.ec1.pay.factory.PaymentFactory;
import com.plateer.ec1.pay.service.PaymentServiceImpl;
import com.plateer.ec1.promotion.controller.PromotionController;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.Calculation;
import com.plateer.ec1.promotion.factory.CalculationFactory;
import com.plateer.ec1.promotion.factory.impl.CartCouponCalculation;
import com.plateer.ec1.promotion.factory.impl.PriceDiscountCalculation;
import com.plateer.ec1.promotion.factory.impl.ProductCouponCalculation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromotionTest{
    @Autowired
    private PromotionController promotionController;
    @Autowired
    private CalculationFactory calculationFactory;

    @Test
    void priceDiscount(){
        RequestPromotionVo reqVo = new RequestPromotionVo();

        calculationFactory.getPromotionCalculator(PromotionType.PRICE_DISCOUNT)
                .getCalculationData(reqVo);
    }

    @Test
    void productCoupon(){
        RequestPromotionVo reqVo = new RequestPromotionVo();

        calculationFactory.getPromotionCalculator(PromotionType.PRODUCT_COUPON)
                .getCalculationData(reqVo);
    }

    @Test
    void cartCoupon(){
        RequestPromotionVo reqVo = new RequestPromotionVo();

        calculationFactory.getPromotionCalculator(PromotionType.CART_COUPON)
                .getCalculationData(reqVo);
    }
    @Test
    void test(){
        //상품쿠폰
        RequestPromotionVo requestPromotionVo = new RequestPromotionVo();
        promotionController.getPromotionApplyData(requestPromotionVo, PromotionType.PRODUCT_COUPON);
    }

}
