package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExchangeWithdrawalDataCreator implements ClaimDataCreator {
    @Override
    public ClaimModel getInsertClaimData(ClaimDto claimDto) {
        log.info("[ECouponCancelAcceptDatatCreator.getInsertClaimData]");
        return new ClaimModel();
    }

    @Override
    public ClaimModel getUpdateClaimData(ClaimDto claimDto) {
        log.info("[ECouponCancelAcceptDatatCreator.getInsertClaimData]");
        return new ClaimModel();
    }
}
