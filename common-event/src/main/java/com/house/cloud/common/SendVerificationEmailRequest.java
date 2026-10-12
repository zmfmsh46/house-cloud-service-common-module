package com.house.cloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendVerificationEmailRequest {
    // 이메일
    private String email;
    // 이메일 인증 코드
    private String verificationCode;
}
