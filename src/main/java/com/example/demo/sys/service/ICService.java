package com.example.demo.sys.service;

import com.example.demo.sys.entity.C;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author feng
 * @since 2021-04-14
 */
public interface ICService extends IService<C> {

    /**
     * 将合并数据放入表C，如果已存在就忽略
     * @param c
     * @return
     */
    boolean mergeInsertToC(List<C> c);


}
