package com.tove.mgs.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author zjianfa
 */
@Data
@AllArgsConstructor
public class Response<T> {
    private String code;
    private String message;
    private Date timestamp;
    private T data;

    public static <T> Response<T> getOk(T data){
        return new Response(BaseErrorCode.OPERATION_SUCCESS.getCode(), BaseErrorCode.OPERATION_SUCCESS.getMsg(), new Date(), data);
    }

    public static <T> Response<T> getOk(){
        return getOk(null);
    }

    public static <T> Response<T> getFail(){
        return getFail(BaseErrorCode.OPERATION_SUCCESS);
    }

    public static <T> Response<T> getFail(BaseError e){
        return getFail(e.getCode(), e.getMsg(),null);
    }

    public static <T> Response<T> getFail(String code, String message, T data){
        return new Response<>(code, message, new Date(), data);
    }

    public static <T> Response<T> getFail(String code, String message){
        return getFail(code, message,null);
    }
}
