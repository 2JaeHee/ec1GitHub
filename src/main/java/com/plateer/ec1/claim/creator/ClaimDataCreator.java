package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimModel;

public interface ClaimDataCreator {

    ClaimModel getInsertClaimData(ClaimDto claimDto);

    ClaimModel getUpdateClaimData(ClaimDto claimDto);

    /*
    private ClaimModel getInsertClaimDto(){
        return new ClaimModel();
    }

    private ClaimModel getUpdateClaimData(){
        return new ClaimModel();
    }

    public void updateOrderBenefitData(ClaimModel claimModel) {

    }

    public ClaimModel insertOrderBenefitRelation(ClaimModel claimModel) {
        return new ClaimModel();
    }

    public void updateOrderCost(ClaimModel claimModel){

    }

    public ClaimModel insertOrderCost(ClaimModel claimModel) {
        return new ClaimModel();
    }

    void updateOrderClaim(ClaimModel claimModel){

    }
    public ClaimModel insertOrderClaim(ClaimModel claimModel) {
        return new ClaimModel();
    }
*/
}
