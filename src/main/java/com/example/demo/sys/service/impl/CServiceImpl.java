package com.example.demo.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.sys.entity.C;
import com.example.demo.sys.mapper.CMapper;
import com.example.demo.sys.service.ICService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author feng
 * @since 2021-04-14
 */
@Service
public class CServiceImpl extends ServiceImpl<CMapper, C> implements ICService {

    @Resource CMapper cMapper;

    public boolean mergeInsertToC(List<C> c){
        for(int i=0;i<c.size();i++){
            QueryWrapper<C> queryWrapper = new QueryWrapper<C>();
            queryWrapper.eq("user_id",c.get(i).getUserId());
            C temp = cMapper.selectOne(queryWrapper);
            if(temp!=null){
                cMapper.insert(c.get(i));
            }
        }
        return true;
    }
}
