package cn.kgc.mybatis.mapper;

import cn.kgc.mybatis.bean.Provider;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProviderMapper {
    @Select("select count(1) from smbms_provider")
    public Integer getCount();

    @Select("select * from smbms_provider")
    public List<Provider> getList();

}
