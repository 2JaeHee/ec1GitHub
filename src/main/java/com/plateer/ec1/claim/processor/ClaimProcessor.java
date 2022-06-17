package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.dto.ClaimDto;

public interface ClaimProcessor {

    void doValidationProcess(ClaimDto claimDto);
    void verifyAmount(ClaimDto claimDto);
    void doProcess(ClaimDto claimDto);
}
