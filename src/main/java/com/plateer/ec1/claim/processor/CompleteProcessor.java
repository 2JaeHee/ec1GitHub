package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.logHelper.MonitoringLogHelper;
import com.plateer.ec1.claim.validator.ClaimValidator;
import lombok.extern.slf4j.Slf4j;

//완료
@Slf4j
public class CompleteProcessor extends ClaimProcessor {
    public CompleteProcessor(ClaimValidator claimValidator, ClaimDataCreator claimDataCreator, MonitoringLogHelper monitoringLogHelper) {
        super(claimValidator, claimDataCreator, monitoringLogHelper);
    }

    @Override
    public void doProcess(ClaimDto claimDto) {
        log.info("[CompleteProcessor.doProcess] 클레임 완료 프로세서");
    }
}
