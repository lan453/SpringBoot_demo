package com.example.springboot_demo.union.result;

public enum ResultEnum {

    OK(200,"操作成功"),
    ERROR(500,"操作失败"),
    ERROR_DUPLICATE_ENTITY(503,"编码已存在"),
    LOGIN_NAME_ERROR(501,"用户名不存在"),
    LOGIN_PWD_ERROR(502,"密码错误");
    private int resultCode;
    private String message;

    ResultEnum(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
