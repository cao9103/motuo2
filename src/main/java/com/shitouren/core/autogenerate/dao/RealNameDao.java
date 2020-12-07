package com.shitouren.core.autogenerate.dao;

import com.shitouren.core.autogenerate.bean.RealName;
import com.shitouren.core.autogenerate.bean.RealNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RealNameDao {
    long countByExample(RealNameExample example);

    int deleteByExample(RealNameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RealName record);

    int insertSelective(RealName record);

    List<RealName> selectByExample(RealNameExample example);

    RealName selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RealName record, @Param("example") RealNameExample example);

    int updateByExample(@Param("record") RealName record, @Param("example") RealNameExample example);

    int updateByPrimaryKeySelective(RealName record);

    int updateByPrimaryKey(RealName record);

    int insertBatchSelective(List<RealName> records);

    int updateBatchByPrimaryKeySelective(List<RealName> records);
}