package com.yuling.zhang.web.user.dao;

import com.yuling.zhang.web.user.entity.UserMessage;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserMessage)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-08 19:05:55
 */
public interface UserMessageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserMessage queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserMessage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userMessage 实例对象
     * @return 对象列表
     */
    List<UserMessage> queryAll(UserMessage userMessage);

    /**
     * 新增数据
     *
     * @param userMessage 实例对象
     * @return 影响行数
     */
    int insert(UserMessage userMessage);

    /**
     * 修改数据
     *
     * @param userMessage 实例对象
     * @return 影响行数
     */
    int update(UserMessage userMessage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}