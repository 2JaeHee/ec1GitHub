package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.dto.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.ResponseBaseVo;

public interface Calculation<T extends ResponseBaseVo> {
    /**
     * 프로모션 데이터 계산
     */
    T getCalculationData(RequestPromotionVo requestPromotionVo);
}
