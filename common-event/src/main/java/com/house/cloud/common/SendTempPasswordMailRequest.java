package com.house.cloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendTempPasswordMailRequest {

    // 이메일
    private String email;
    // 임시 비밀번호
    private String tempPassword;

}
