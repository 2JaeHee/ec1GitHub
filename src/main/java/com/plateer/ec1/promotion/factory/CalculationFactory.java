package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CalculationFactory<T extends ResponseBaseVo> {
    private Calculation calculation;

    public T getPromotionCalculationData(RequestPromotionVo requestPromotionVo, PromotionType promotionType) {

        if(PromotionType.PRICE_DISCOUNT == promotionType) {
            calculation = new PriceDiscountCalculation();
        } else if (PromotionType.PRODUCT_COUPON == promotionType) {
            calculation = new ProductCouponCalculation();
        } else if (PromotionType.CART_COUPON == promotionType) {
            calculation = new CartCouponCalculation();
        }

        return (T) calculation.getCalculationData(requestPromotionVo);
    }

}
