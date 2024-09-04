package com.itheima.service;

import com.itheima.pojo.Address;
import com.itheima.pojo.Result;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {

    public Address getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return addr;
    }
}
