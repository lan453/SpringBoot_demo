package com.example.springboot_demo.controller;

import com.example.springboot_demo.entity.Tclass;
import com.example.springboot_demo.entity.Tcolleage;
import com.example.springboot_demo.service.Tclass.IClassService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mgt/class")
public class ClassController {
    @Autowired
    IClassService classService;
    @PostMapping("/query")
    public List<CommonClass> queryClass(){
        return this.classService.queryClass();
    }
    @PostMapping("/addClass")
    public Result addClass(Tclass obj){
        this.classService.addClass(obj);
        return Result.OK();
    }
    @PostMapping("/pageList")
    public PageDataClass<CommonClass> queryPaged(int page, int  rows, Tclass param){
        return this.classService.queryPagedClass(page,rows,param);
    }
    @PostMapping("/queryPrimaryKey/{id}")
    public Result queryClassByID(@PathVariable(name = "id") int id){
        Tclass tclass = this.classService.queryClassById(id);
        return Result.OK(tclass);
    }

    @PutMapping("/updateClass")
    public Result updateClass(Tclass tclass){
        this.classService.updateClass(tclass);
        return Result.OK();
    }
    @DeleteMapping("/delete/{id}")
    public Result deleteClass(@PathVariable(name = "id") int id){
        this.classService.deleteClass(id);
        return Result.OK();
    }
    @PostMapping("/queryByColleageId/{colleageId}")
    public List<ComBoxEntity> queryByColleageId(@PathVariable(name = "colleageId") Integer colleageId){
        return this.classService.queryByColleageId(colleageId);
    }
    @PostMapping("/queryByColleage/{colleageId}")
    public Result queryByColleage(@PathVariable(name = "colleageId") Integer colleageId){
        List<ComBoxEntity> datas = this.classService.queryByColleageId(colleageId);
        return Result.OK(datas);
    }
    @PostMapping("/listClassByInstructorId/{instructorId}")
    public Result listClassByInstructorId(@PathVariable(name = "instructorId") Integer instructorId){
        List<CommonInCla> datas = this.classService.listClassByInstructorId(instructorId);
        return Result.OK(datas);
    }
    @PostMapping("/listClassByEnterYearAndColleage")
    public Result listClassByEnterYearAndColleage(@RequestParam("name")String name,@RequestParam("enteryears") List<Integer> enteryears){
        List<CommonClass> datas = this.classService.listClassByEnterYearAndColleage(name,enteryears);
        return Result.OK(datas);
    }
}
