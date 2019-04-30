package com.ys.egou.mapper.user;

import com.ys.egou.model.user.EgouUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EgouUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EgouUser record);

    int insertSelective(EgouUser record);

    EgouUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EgouUser record);

    int updateByPrimaryKey(EgouUser record);
}