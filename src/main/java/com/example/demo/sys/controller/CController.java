package com.example.demo.sys.controller;


import com.example.demo.sys.entity.A;
import com.example.demo.sys.entity.B;
import com.example.demo.sys.entity.C;
import com.example.demo.sys.service.IAService;
import com.example.demo.sys.service.IBService;
import com.example.demo.sys.service.ICService;
import com.example.demo.sys.util.ATransToC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.example.demo.common.BaseController;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  表C控制器 合并表
 * </p>
 *
 * @author feng
 * @since 2021-04-14
 */
@RestController
@RequestMapping("/sys/c")
public class CController extends BaseController {

    @Resource
    IAService iaService;

    @Resource
    IBService ibService;

    @Resource
    ICService icService;

    @GetMapping("/merge")
    public Boolean merge(){
        List<A> tempA=new ArrayList<A>();
        tempA=iaService.list();
        List<B> tempB=new ArrayList<B>();
        tempB=ibService.list();
        List<C> tempC=new ArrayList<C>();
        for(int i=0;i<tempA.size();i++){
            for(int j=0;j<tempB.size();j++){
                if (tempA.get(i).getUserId() == tempB.get(j).getUserId()) {
                    int count=0;
                    if(tempA.get(i).getTest1().equals(tempB.get(i).getTest1()))count++;
                    if(tempA.get(i).getTest2().equals(tempB.get(i).getTest2()))count++;
                    if(tempA.get(i).getTest3().equals(tempB.get(i).getTest3()))count++;
                    if(tempA.get(i).getTest4().equals(tempB.get(i).getTest4()))count++;
                    if(tempA.get(i).getTest5().equals(tempB.get(i).getTest5()))count++;
                    if(tempA.get(i).getTest6().equals(tempB.get(i).getTest6()))count++;
                    if(tempA.get(i).getTest7().equals(tempB.get(i).getTest7()))count++;
                    if(tempA.get(i).getTest8().equals(tempB.get(i).getTest8()))count++;
                    if(count>=5){
                        tempC.add(ATransToC.trans(tempA.get(i)));
                    }
                    break;
                }
            }
        }

        return icService.mergeInsertToC(tempC);
    }

}
