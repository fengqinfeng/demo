package com.example.demo.sys.service.impl;

import com.example.demo.sys.entity.A;
import com.example.demo.sys.mapper.AMapper;
import com.example.demo.sys.service.IAService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author feng
 * @since 2021-04-14
 */
@Service
public class AServiceImpl extends ServiceImpl<AMapper, A> implements IAService {

}
