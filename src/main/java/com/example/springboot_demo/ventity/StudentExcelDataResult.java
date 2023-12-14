package com.example.springboot_demo.ventity;

import com.alibaba.excel.annotation.ExcelProperty;

public class StudentExcelDataResult extends StudentExcelData {
    @ExcelProperty("导入结果")
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
