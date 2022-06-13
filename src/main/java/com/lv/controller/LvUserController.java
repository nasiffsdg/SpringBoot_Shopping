package com.lv.controller;

import com.lv.entity.LvUser;
import com.lv.service.LvUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (LvUser)表控制层
 *
 * @author makejava
 * @since 2022-06-12 00:46:32
 */
@RestController
@RequestMapping("lvUser")
public class LvUserController {
    /**
     * 服务对象
     */
    @Resource
    private LvUserService lvUserService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<LvUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.lvUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param lvUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<LvUser> add(LvUser lvUser) {
        return ResponseEntity.ok(this.lvUserService.insert(lvUser));
    }

    /**
     * 编辑数据
     *
     * @param lvUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<LvUser> edit(LvUser lvUser) {
        return ResponseEntity.ok(this.lvUserService.update(lvUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.lvUserService.deleteById(id));
    }

}

