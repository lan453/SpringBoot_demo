package com.example.springboot_demo.controller;

import com.example.springboot_demo.entity.Tinstructor;
import com.example.springboot_demo.entity.Tinstructorclass;
import com.example.springboot_demo.service.instructor.IInstructorService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mgt/instructor")
public class InstructConstroller {
    @Autowired
    private IInstructorService instructorService;
    @PostMapping("/query")
    public PagedData queryPagedInstructor(int page, int rows, Tinstructor param) {
        return instructorService.queryPagedInstructor(page, rows, param);
    }
    @PostMapping("/add")
    public Result add(@RequestBody InstructorClassParam param){
        this.instructorService.add(param);
        return Result.OK();
    }
    @PostMapping("/queryVinstructor")
    public PageDataClass<Vinstructor> queryByParam(int page, int rows, InstructorClassQueryParam param){
        return this.instructorService.queryByParam(page,rows,param);
    }
    @DeleteMapping("/delete/{id}")
    public Result deleteInstructor(@PathVariable(name = "id") Short id){
        this.instructorService.deleteInstructor(id);
        return Result.OK();
    }
    @DeleteMapping("/deleteIc/{id}")
    public Result deleteInstructorClass(@PathVariable(name = "id") Integer id){
        this.instructorService.deleteInstructorClass(id);
        return Result.OK();
    }
    @PutMapping("/updateInstructor")
    public Result updateInstructor(Vinstructor in){
        this.instructorService.updateInstructor(in);
        return Result.OK();
    }
    @PutMapping("/updateIcstructor")
    public Result updateInstructorClass(Tinstructorclass ic){
        this.instructorService.updateInstructorClass(ic);
        return Result.OK();
    }
    @PostMapping("/queryInPrimaryKey/{id}")
    public Result queryInstructor(@PathVariable(name = "id") Short id){
        Tinstructor in = this.instructorService.queryInstructorById(id);
        return Result.OK(in);
    }
    @PostMapping("/queryIcPrimaryKey/{id}")
    public Result queryInstructorClass(@PathVariable(name = "id") Integer id){
        Tinstructorclass ic =this.instructorService.queryInstructorClassById(id);
        return Result.OK(ic);
    }
    @PostMapping("/addInstructor")
    public Result addInstructor(Tinstructor tinstructor){
        this.instructorService.addInstructor(tinstructor);
        return Result.OK();
    }
    @PostMapping("/addInstructorClass")
    public Result addInstructorClass(@RequestParam("instructorId")Short instructorId,
                                     @RequestParam("classId")List<Integer> classId,
                                     @RequestParam("startAcademicYearId")Byte startAcademicYearId,
                                     @RequestParam("startTerm")Byte startTerm,
                                     @RequestParam("termCount")Byte termCount){
//        System.out.println("辅导员编号:"+instructorId);//辅导员编号
//        System.out.println("班级编号:"+classId);//班级编号
//        System.out.println("开始学年:"+startAcademicYearId);//开始学年
//        System.out.println("开始学期:"+startTerm);//开始学期
//        System.out.println("学期数:"+termCount);//学期数
        instructorService.insertInstructorClass(instructorId,classId,
                            startAcademicYearId,startTerm,termCount);
        return Result.OK();
    }

}
