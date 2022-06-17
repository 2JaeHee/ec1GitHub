package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.logHelper.MonitoringLogHelper;
import com.plateer.ec1.claim.validator.ClaimValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public abstract class ClaimProcessor {
    private final ClaimValidator claimValidator;
    private final ClaimDataCreator claimDataCreator;
    private final MonitoringLogHelper monitoringLogHelper;

    private void doValidationProcess(ClaimDto claimDto) {

    }
    private void verifyAmount(ClaimDto claimDto) {

    }

    public abstract void doProcess(ClaimDto claimDto);
}
