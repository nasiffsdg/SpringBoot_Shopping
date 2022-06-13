package com.lv.service;

import com.lv.entity.LvUser;


/**
 * (LvUser)表服务接口
 *
 * @author makejava
 * @since 2022-06-12 00:46:32
 */
public interface LvUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LvUser queryById(Integer id);



    /**
     * 新增数据
     *
     * @param lvUser 实例对象
     * @return 实例对象
     */
    LvUser insert(LvUser lvUser);

    /**
     * 修改数据
     *
     * @param lvUser 实例对象
     * @return 实例对象
     */
    LvUser update(LvUser lvUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
