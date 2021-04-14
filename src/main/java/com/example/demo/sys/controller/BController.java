package com.example.demo.sys.controller;


import com.example.demo.sys.entity.A;
import com.example.demo.sys.entity.B;
import com.example.demo.sys.service.IBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.example.demo.common.BaseController;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  表B控制器
 * </p>
 *
 * @author feng
 * @since 2021-04-14
 */
@RestController
@RequestMapping("/sys/b")
public class BController extends BaseController {

    @Resource
    IBService ibService;

    @GetMapping("/insertAll")
    public Boolean insertAll(){
        List<B> temp= new ArrayList<B>();
        int t=0;
        for(int i=1;i<=10;i++){
            B te=new B();
            t=(int)(Math.random()*2);
            te.setTest1( t==0 ? "1":"2");
            t=(int)(Math.random()*2);
            te.setTest2( t==0 ? "1":"2");
            t=(int)(Math.random()*2);
            te.setTest3( t==0 ? "1":"2");
            t=(int)(Math.random()*2);
            te.setTest4( t==0 ? "1":"2");
            t=(int)(Math.random()*2);
            te.setTest5( t==0 ? "1":"2");
            t=(int)(Math.random()*2);
            te.setTest6( t==0 ? "1":"2");
            t=(int)(Math.random()*2);
            te.setTest7( t==0 ? "1":"2");
            t=(int)(Math.random()*2);
            te.setTest8( t==0 ? "1":"2");
            te.setUserId((long)i);
            temp.add(te);
        }
        return ibService.saveBatch(temp);
    }

}
