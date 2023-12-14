package com.example.springboot_demo.advice;

import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.union.result.ResultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class SystemExceptionAdvice {
    @ResponseBody
    @ExceptionHandler({SQLIntegrityConstraintViolationException.class})
    public Result dupliceData(SQLIntegrityConstraintViolationException e){
        if (e.getMessage().contains("Duplicate")){
            return Result.ERROR(ResultEnum.ERROR_DUPLICATE_ENTITY);
        }
        return Result.ERROR();
    }

    @ResponseBody
    @ExceptionHandler({SQLException.class})
    public Result sqlExcep(SQLException e){
        e.printStackTrace();
        return Result.ERROR();
    }

//    @ResponseBody
//    @ExceptionHandler({Exception.class})
//    public Result commonExcep(Exception e){
//        e.printStackTrace();
//        return Result.ERROR();
//    }
}
