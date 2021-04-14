package com.example.demo.sys.controller;


import com.example.demo.sys.entity.A;
import com.example.demo.sys.mapper.AMapper;
import com.example.demo.sys.service.IAService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.example.demo.common.BaseController;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  表A控制器
 * </p>
 *
 * @author feng
 * @since 2021-04-14
 */
@RestController
@RequestMapping("/sys/a")
public class AController extends BaseController {

    @Resource
    IAService iaService;

    @Resource
    AMapper aMapper;

    @GetMapping("/test")
    public boolean test(){
        A testa=new A();
        // 获取当前日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        testa.setId((long)50);
        testa.setTest1("1");
//        testa.setCreateTime(localDateTime);
//        testa.setUpdateTime(localDateTime);
        boolean re=iaService.save(testa);
        return re;
    }

    @GetMapping("/selectAll")
    public List<A> selectAll(){
        List<A> re= new ArrayList<>();
        re=iaService.list();
        return re;
    }

    @GetMapping("/insertAll")
    public Boolean insertAll(){
        List<A> temp= new ArrayList<A>();
        int t=0;
        for(int i=1;i<=10;i++){
            A te=new A();
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
        return iaService.saveBatch(temp);
    }




}
