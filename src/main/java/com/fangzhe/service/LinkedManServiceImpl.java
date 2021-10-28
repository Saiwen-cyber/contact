package com.fangzhe.service;

import com.fangzhe.dao.LinkedManMapper;
import com.fangzhe.pojo.LinkedMan;

import java.util.List;

public class LinkedManServiceImpl implements LinkedManService{
    private LinkedManMapper manMapper;

    public void setManMapper(LinkedManMapper manMapper) {
        this.manMapper = manMapper;
    }

    @Override
    public int addLinkedMan(LinkedMan man) {
        return manMapper.addLinkedMan(man);
    }

    @Override
    public int deleteLinkedManById(int id) {
        return manMapper.deleteLinkedManById(id);
    }

    @Override
    public int updateLinkedMan(LinkedMan man) {
        return manMapper.updateLinkedMan(man);
    }

    @Override
    public LinkedMan queryLinkedManById(int id) {
        return manMapper.queryLinkedManById(id);
    }

    @Override
    public List<LinkedMan> queryAllLinkedMan() {
        return manMapper.queryAllLinkedMan();
    }
}
