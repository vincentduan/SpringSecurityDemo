package ssm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.model.Authorities;
import ssm.model.AuthoritiesExample;

public interface AuthoritiesMapper {
    int countByExample(AuthoritiesExample example);

    int deleteByExample(AuthoritiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Authorities record);

    int insertSelective(Authorities record);

    List<Authorities> selectByExample(AuthoritiesExample example);

    Authorities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Authorities record, @Param("example") AuthoritiesExample example);

    int updateByExample(@Param("record") Authorities record, @Param("example") AuthoritiesExample example);

    int updateByPrimaryKeySelective(Authorities record);

    int updateByPrimaryKey(Authorities record);
}