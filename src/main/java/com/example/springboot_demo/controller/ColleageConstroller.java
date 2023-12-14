package com.example.springboot_demo.controller;
//控制层作用：接收参数，返回结果，调用服务层
import com.example.springboot_demo.entity.Tcolleage;
import com.example.springboot_demo.service.colleage.IColleageService;
import com.example.springboot_demo.union.result.Result;
import com.example.springboot_demo.ventity.PagedData;
import com.example.springboot_demo.ventity.VColleage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/mgt/colleage")
public class ColleageConstroller {
    @Autowired
    private IColleageService colleageService;

    @PostMapping("/query")
    public PagedData queryPagedColleage(int page, int rows, Tcolleage param) {
        return colleageService.queryPagedColleage(page, rows, param);
    }

    @PostMapping("/add")
    public Result addColleage(Tcolleage param){
        boolean isok = this.colleageService.addColleage(param);
        if (isok){
            return Result.OK();
        }else {
            return Result.ERROR();
        }
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteColleage(@PathVariable(name = "id") byte id){
        this.colleageService.deleteColleage(id);
        return Result.OK();
    }
    @PostMapping("/queryPrimaryKey/{id}")
    public Result queryColleageByID(@PathVariable(name = "id") byte id){
        Tcolleage colleage = this.colleageService.queryColleageById(id);
        return Result.OK(colleage);
    }

    @PutMapping("/updateColleage")
    public Result updateColleage(Tcolleage colleage){
        this.colleageService.updateColleage(colleage);
        return Result.OK();
    }


    @PostMapping("/vcolleage")
    public List<VColleage> addVColleage(){
        return this.colleageService.ListColleage();
    }
    @PostMapping("/addColleage")
    public List<VColleage> addColleage(){
        return this.colleageService.selectVcolleage();
    }


    @PostMapping("/queryClassTree")
    public List<VColleage> classTree(){
            return this.colleageService.queryClassTree();
    }

    @PostMapping("/listAstree")
            public Result ListAllColleageAll (){
            List<VColleage> datas = this.colleageService.ListColleage();
            return Result.OK(datas);
            }
    @PostMapping("/queryColleages")
    public Result queryColleages (){
        List<VColleage> datas = this.colleageService.selectVcolleage();
        return Result.OK(datas);
    }
    @PostMapping("/ColleageClassTree")
    public Result QueryClassTree(){
        List<VColleage> datas = this.colleageService.queryClassTree();
        return Result.OK(datas);
    }
    @PostMapping("/ListCEATree")
    public Result ListCEATree(){
        List<VColleage> datas = this.colleageService.ListCEATree();
        return Result.OK(datas);
    }
    @GetMapping("/test")
    public Result test(@RequestParam("a") int b){
        System.out.println(b);
        return Result.OK();
    }
}