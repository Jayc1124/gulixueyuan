package com.jaycao.eduservice.controller;


import com.jaycao.eduservice.entity.EduTeacher;
import com.jaycao.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author JAYCAO
 * @since 2021-10-06
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    //1.查询所有数据
    //rest风格
    @GetMapping("/findall")
    public List<EduTeacher> findAllTeacher(){
        //调用service中的方法查询所有操作
        List<EduTeacher> list = eduTeacherService.list(null);
        return list;
    }
    @DeleteMapping("{id}")
    public boolean removeTeacher(@PathVariable String  id){
        boolean b = eduTeacherService.removeById(id);
        return b;
    }
}

