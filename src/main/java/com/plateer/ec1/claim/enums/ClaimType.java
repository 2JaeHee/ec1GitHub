package com.plateer.ec1.claim.enums;

import com.plateer.ec1.claim.processor.config.ClaimProcessorConfig;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@RequiredArgsConstructor
public enum ClaimType {


    GCC(getClaimProcessor(ClaimTypeProcessor.GCC_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    MCA(getClaimProcessor(ClaimTypeProcessor.MCA_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    MCC(getClaimProcessor(ClaimTypeProcessor.MCC_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    RA(getClaimProcessor(ClaimTypeProcessor.RA_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    RC(getClaimProcessor(ClaimTypeProcessor.RC_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    RW(getClaimProcessor(ClaimTypeProcessor.RW_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    EA(getClaimProcessor(ClaimTypeProcessor.EA_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    EW(getClaimProcessor(ClaimTypeProcessor.EW_PROCESSOR), new ArrayList<>(), new ArrayList<>(), true, "", "", new ArrayList<>()),
    ;

    @Getter
    private final Supplier<ClaimProcessor> claimProcessor;
    @Getter
    private final List<String> validStatusList;
    @Getter
    private final List<String> productType;
    @Getter
    private final Boolean claimNoFlag;
    @Getter
    private final String claimCode;
    @Getter
    private final String orderStateCode;
    @Getter
    private final List<String> deliveryCode;


    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ClaimProcessorConfig .class);

    public static Supplier<ClaimProcessor> getClaimProcessor(ClaimTypeProcessor param){
        return () -> ac.getBean(param.getCode(), ClaimProcessor.class);
    }

    @RequiredArgsConstructor
    enum ClaimTypeProcessor {
        GCC_PROCESSOR("gccClaimProcessor"),
        MCA_PROCESSOR("mcaClaimProcessor"),
        MCC_PROCESSOR("mccClaimProcessor"),
        RA_PROCESSOR("raClaimProcessor"),
        RC_PROCESSOR("rcClaimProcessor"),
        RW_PROCESSOR("rwClaimProcessor"),
        EA_PROCESSOR("eaClaimProcessor"),
        EW_PROCESSOR("ewClaimProcessor"),
        ;

        @Getter
        private final String code;
    }
}
