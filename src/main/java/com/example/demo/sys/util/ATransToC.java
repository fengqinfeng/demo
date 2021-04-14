package com.example.demo.sys.util;

import com.example.demo.sys.entity.A;
import com.example.demo.sys.entity.C;

public class ATransToC {
    public static C trans(A a){
        C result =new C();
        result.setUserId(a.getUserId());
        result.setIsDel(a.getIsDel());
        result.setTest1(a.getTest1());
        result.setTest2(a.getTest2());
        result.setTest3(a.getTest3());
        result.setTest4(a.getTest4());
        result.setTest5(a.getTest5());
        result.setTest6(a.getTest6());
        result.setTest7(a.getTest7());
        result.setTest8(a.getTest8());
        return result;
    }
}
