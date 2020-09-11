package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//Freemarker模板引擎渲染WEB视图
@Controller
@RequestMapping("/freemarker")
public class FreeMarkerController {
    @RequestMapping("/index")
    public String fmIndex(Map<String,Object> map){
        map.put("name","GT");
        map.put("age","123");
        return "fmIndex";
    }
    @RequestMapping("/index2")
    public String fmIndex2(Map<String,Object> result){
        result.put("name", "GT");
        result.put("sex", "0");

        List<String> listResult = new ArrayList<>();
        listResult.add("zhangsan");
        listResult.add("lisi");
        listResult.add("wangwu");
        result.put("userlist", listResult);
        return "fmIndex2";
    }
}
