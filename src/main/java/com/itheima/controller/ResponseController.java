package com.itheima.controller;

import com.itheima.pojo.Address;
import com.itheima.pojo.Result;
import com.itheima.service.ResponseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ResponseController {

    private ResponseService responseService;
/*    @RequestMapping("/hello1")
    public String hello(){
        System.out.println("Hello World");
        return "Hello World";
    }
    @RequestMapping("/getAddr")
    public Address getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return addr;
    }
    @RequestMapping("/listAddr")
    public List<Address> listAddr(){
        List<Address> list = new ArrayList<>();
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");
        list.add(addr);
        list.add(addr2);
        return list;
    }*/

    @RequestMapping("/hello1")
    public Result hello(){
        System.out.println("Hello World");
        // return new Result(1,"success","Hello World");
        return Result.success("Hello World");
    }

    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = responseService.getAddr();
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address> list = new ArrayList<>();
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");
        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }
}
