package com.example.springboot_demo.union.result;

public class Result {
    private int resultCode;
    private String message;
    private Object datas = "";

    public Result() {
    }

    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public Result(int resultCode, String message, Object datas) {
        this.resultCode = resultCode;
        this.message = message;
        this.datas = datas;
    }
    public static Result OK(){
        return new Result(ResultEnum.OK.getResultCode(),ResultEnum.OK.getMessage());
    }
    public static Result OK(Object data){
        return new Result(ResultEnum.OK.getResultCode(), ResultEnum.OK.getMessage(),data);
    }
    public static Result ERROR(){
        return new Result(ResultEnum.ERROR.getResultCode(), ResultEnum.ERROR.getMessage());
    }
    public static Result ERROR(ResultEnum e){
        return new Result(e.getResultCode(),e.getMessage());
    }

    public static Result TOEKN_ERROR(String message) {
        return null;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }
}

















