package com.fangzhe.dao;

import com.fangzhe.pojo.LinkedMan;

import java.util.List;

public interface LinkedManMapper {


    /**
     * 新增联系人
     * @param man
     * @return
     */
    int addLinkedMan(LinkedMan man);
    /**
     * 删除联系人
     * @param id
     * @return
     */
    int deleteLinkedManById(int id);
    /**
     * 更新联系人
     * @param man
     * @return
     */
    int updateLinkedMan(LinkedMan man);
    /**
     * 根据id查询联系人
     * @param id
     * @return
     */
    LinkedMan queryLinkedManById(int id);
    /**
     * 列表
     * @return
     */
    List<LinkedMan> queryAllLinkedMan();

}
