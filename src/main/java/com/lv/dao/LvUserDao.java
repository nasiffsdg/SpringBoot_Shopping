package com.lv.dao;
import com.lv.entity.LvUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LvUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-12 00:46:32
 */
@Mapper
public interface LvUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LvUser queryById(Integer id);


    /**
     * 统计总行数
     *
     * @param lvUser 查询条件
     * @return 总行数
     */
    long count(LvUser lvUser);

    /**
     * 新增数据
     *
     * @param lvUser 实例对象
     * @return 影响行数
     */
    int insert(LvUser lvUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LvUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LvUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LvUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<LvUser> entities);

    /**
     * 修改数据
     *
     * @param lvUser 实例对象
     * @return 影响行数
     */
    int update(LvUser lvUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

