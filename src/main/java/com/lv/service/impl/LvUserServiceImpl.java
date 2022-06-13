package com.lv.service.impl;

import com.lv.entity.LvUser;
import com.lv.dao.LvUserDao;
import com.lv.service.LvUserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (LvUser)表服务实现类
 *
 * @author makejava
 * @since 2022-06-12 00:46:33
 */
@Service("lvUserService")
public class LvUserServiceImpl implements LvUserService {
    @Resource
    private LvUserDao lvUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LvUser queryById(Integer id) {
        return this.lvUserDao.queryById(id);
    }



    /**
     * 新增数据
     *
     * @param lvUser 实例对象
     * @return 实例对象
     */
    @Override
    public LvUser insert(LvUser lvUser) {
        this.lvUserDao.insert(lvUser);
        return lvUser;
    }

    /**
     * 修改数据
     *
     * @param lvUser 实例对象
     * @return 实例对象
     */
    @Override
    public LvUser update(LvUser lvUser) {
        this.lvUserDao.update(lvUser);
        return this.queryById(lvUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.lvUserDao.deleteById(id) > 0;
    }
}
