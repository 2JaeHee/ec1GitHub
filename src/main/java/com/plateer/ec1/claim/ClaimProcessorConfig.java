package com.plateer.ec1.claim;

import com.plateer.ec1.claim.creator.*;
import com.plateer.ec1.claim.logHelper.MonitoringLogHelper;
import com.plateer.ec1.claim.processor.AcceptWithdrawalProcessor;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import com.plateer.ec1.claim.processor.CompleteProcessor;
import com.plateer.ec1.claim.validator.ClaimValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClaimProcessorConfig {

    //(일반) 주문취소완료 (완료 프로세서, 취소데이터 생성 프로세서)
    @Bean
    public ClaimProcessor gccClaimProcessor(){
        return new CompleteProcessor(new ClaimValidator(),  new GeneralOrderCancelDatatCreator(), new MonitoringLogHelper());
    }
    //모바일쿠폰접수 (접수프로세서, 모바일쿠폰 취소 접수 프로세서)
    @Bean
    public ClaimProcessor mcaClaimProcessor(){
        return new AcceptWithdrawalProcessor(new ClaimValidator(), new ECouponCancelAcceptDatatCreator(), new MonitoringLogHelper());
    }
    //모바일쿠폰취소완료 (완료프로세서, 모바일쿠폰 취소완료 프로세서)
    @Bean
    public ClaimProcessor mccClaimProcessor(){
        return new CompleteProcessor(new ClaimValidator(), new ECouponCancelCompleteDataCreator(), new MonitoringLogHelper());
    }
    //반품접수
    @Bean
    public ClaimProcessor raClaimProcessor(){
        return new AcceptWithdrawalProcessor(new ClaimValidator(), new ReturnAcceptDataCreator(), new MonitoringLogHelper());
    }
    //반품완료
    //TODO creator 어떤거로 써야하는지 물어보기
    @Bean
    public ClaimProcessor rcClaimProcessor(){
        return new CompleteProcessor(new ClaimValidator(), new ReturnAcceptDataCreator(), new MonitoringLogHelper());
    }
    //반품철회
    @Bean
    public ClaimProcessor rwClaimProcessor(){
        return new AcceptWithdrawalProcessor(new ClaimValidator(), new ReturnWithdrawalDataCreator(), new MonitoringLogHelper());
    }
    //교환접수
    @Bean
    public ClaimProcessor eaClaimProcessor(){
        return new AcceptWithdrawalProcessor(new ClaimValidator(), new ExchnageAccpetDataCreator(), new MonitoringLogHelper());
    }
    //교환철회
    @Bean
    public ClaimProcessor ewClaimProcessor(){
        return new AcceptWithdrawalProcessor(new ClaimValidator(), new ExchangeWithdrawalDataCreator(), new MonitoringLogHelper());
    }
}
