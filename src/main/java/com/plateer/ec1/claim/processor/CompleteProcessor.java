package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.logHelper.MonitoringLogHelper;
import com.plateer.ec1.claim.validator.ClaimValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//완료
@Slf4j
@Service
@RequiredArgsConstructor
public class CompleteProcessor implements ClaimProcessor {
    private final ClaimValidator claimValidator;
//    private final ClaimDataCreator claimDataCreator;
    private final MonitoringLogHelper monitoringLogHelper;

    @Override
    public void doValidationProcess(ClaimDto claimDto) {
        claimValidator.isValidStatus(claimDto);
        claimValidator.isValidAmount(claimDto);
        log.info("[CompleteProcessor.doValidationProcess] doValidationProcess");
    }

    @Override
    public void verifyAmount(ClaimDto claimDto) {
        claimValidator.verifyAmount(claimDto);
        log.info("[CompleteProcessor.verifyAmount] verifyAmount");
    }

    @Override
    public void doProcess(ClaimDto claimDto) {
        log.info("[CompleteProcessor.doProcess] 클레임 완료 프로세서");
//        claimDataCreator.getInsertClaimData(claimDto);
//        claimDataCreator.getUpdateClaimData(claimDto);
        Long logNo = monitoringLogHelper.insertMonitoringLog("1");
        monitoringLogHelper.updateMonitortingLog(logNo, "complete");
        
        //1. 로그 , 2. vaildation, 3. insert data 생성 , 4. 결제/외부 인터페이스 호출, 5.금액검증
    }
}
