package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.logHelper.MonitoringLogHelper;
import com.plateer.ec1.claim.validator.ClaimValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

//접수 / 철회
@Slf4j
@Component
public class AcceptWithdrawalProcessor extends ClaimProcessor{

    public AcceptWithdrawalProcessor(ClaimValidator claimValidator, ClaimDataCreator claimDataCreator, MonitoringLogHelper monitoringLogHelper) {
        super(claimValidator, claimDataCreator, monitoringLogHelper);
    }

    @Override
    public void doProcess(ClaimDto claimDto) {
        log.info("[AcceptWithdrawalProcessor.doProcess] 클레임 접수 / 철회 프로세서");
    }
}
