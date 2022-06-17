package com.plateer.ec1.claim.enums;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.creator.GeneralOrderCancelDatatCreator;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@RequiredArgsConstructor
public enum ClaimType {
    GCC(GeneralOrderCancelDatatCreator::new, new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    //GCC(CompleteProcessor::new, GeneralOrderCancelDatatCreator::new, new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    ;

    //private final Supplier<ClaimProcessor> claimProcessor;
    private final Supplier<ClaimDataCreator> claimDataCreator;
    private final List<String> validStatusList;
    private final List<String> productType;
    private final Boolean claimNoFlag;
    private final String claimCode;
    private final String orderStateCode;
    private final List<String> deliveryCode;

}
