package com.tove.mgs.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum BaseErrorCode implements BaseError{
    OPERATION_SUCCESS("1000", "操作成功"),
    SYSTEM_BUSY("1001","系统繁忙"),
    ILLEGAL_PARAMETERS("1002","参数不合法"),
    NOT_LOGIN("1003", "未登陆，请登陆后再访问"),
    NOT_AUTH("1004", "无权限，请联系管理员授予权限"),
    ;

    private final String code;
    private final String msg;
}
