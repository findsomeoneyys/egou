package com.ys.egou.service.user;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ys.egou.model.user.EgouUser;
import com.ys.egou.mapper.user.EgouUserMapper;
@Service
public class EgouUserService{

    @Resource
    private EgouUserMapper egouUserMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return egouUserMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(EgouUser record) {
        return egouUserMapper.insert(record);
    }

    
    public int insertSelective(EgouUser record) {
        return egouUserMapper.insertSelective(record);
    }

    
    public EgouUser selectByPrimaryKey(Integer id) {
        return egouUserMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(EgouUser record) {
        return egouUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(EgouUser record) {
        return egouUserMapper.updateByPrimaryKey(record);
    }

}
