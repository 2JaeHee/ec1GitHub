package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.dto.Promotion;
import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseCartCouponVo;
import com.plateer.ec1.promotion.dto.ResponseProductCouponVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CartCouponCalculation implements Calculation {
    /**
     * 장바구니 쿠폰 조회 (주문서에서 적용되는 쿠폰 프로모션)
     * @param requestPromotionVo
     * @return
     */
    @Override
    public ResponseCartCouponVo getCalculationData(RequestPromotionVo requestPromotionVo) {
        Promotion promotion = getAvailablePromotionData(requestPromotionVo);

        ResponseCartCouponVo responseCartCouponVo = calculateMaxBenefit(calculateDcAmt(promotion, requestPromotionVo));

        return responseCartCouponVo;
    }
    /**
     * 최대할인계산
     * @param responseCartCouponVo
     * @return
     */
    private ResponseCartCouponVo calculateMaxBenefit(ResponseCartCouponVo responseCartCouponVo) {
        log.info("[CartCouponCalculation.calculateMaxBenefit]");
        //최대할인계산
        log.info("장바구니 쿠폰 최대 할인 계산");
        return new ResponseCartCouponVo();
    }
    /**
     * 조회 된 프로모션 정보 계산 적용
     * @param promotion
     * @param requestPromotionVo
     * @return ResponseBaseVo
     */
    private ResponseCartCouponVo calculateDcAmt(Promotion promotion, RequestPromotionVo requestPromotionVo) {
        log.info("[CartCouponCalculation.calculateDcAmt]");
        //조회 한 쿠폰과 주문서에서 넘어온 상품쿠폰을 적용 후 가격 계산
        log.info("조회 한 쿠폰과 주문서에서 넘어온 상품쿠폰을 적용 후 가격 계산");
        return new ResponseCartCouponVo();
    }
    /**
     * 장바구니 쿠폰 정보 조회
     * @param requestPromotionVo
     * @return Promotion
     */
    private Promotion getAvailablePromotionData(RequestPromotionVo requestPromotionVo){
        log.info("[CartCouponCalculation.getAvailablePromotionData]");
        //장바구니 쿠폰 정보 조회
        log.info("장바구니 쿠폰 정보 조회");
        return new Promotion();
    }
}
