package com.cn.syh.mapper;


import com.cn.syh.entity.train_info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Infomapper {

    public List<train_info> sel();
}
