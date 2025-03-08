package com.ruoyi.departments.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.departments.mapper.DeptMapper;
import com.ruoyi.departments.domain.Dept;
import com.ruoyi.departments.service.IDeptService;

/**
 * 区域信息Service业务层处理
 * 
 * @author NIGHTLOS
 * @date 2025-03-03
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class DeptServiceImpl implements IDeptService 
{
    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询区域信息
     * 
     * @param deptId 区域信息主键
     * @return 区域信息
     */
    @Override
    public Dept selectDeptByDeptId(Long deptId)
    {
        return deptMapper.selectDeptByDeptId(deptId);
    }

    /**
     * 查询区域信息列表
     * 
     * @param dept 区域信息
     * @return 区域信息
     */
    @Override
    public List<Dept> selectDeptList(Dept dept)
    {
        return deptMapper.selectDeptList(dept);
    }

    /**
     * 新增区域信息
     * 
     * @param dept 区域信息
     * @return 结果
     */
    @Override
    public int insertDept(Dept dept)
    {
        dept.setCreateTime(DateUtils.getNowDate());
        return deptMapper.insertDept(dept);
    }

    /**
     * 修改区域信息
     * 
     * @param dept 区域信息
     * @return 结果
     */
    @Override
    public int updateDept(Dept dept)
    {
        dept.setUpdateTime(DateUtils.getNowDate());
        return deptMapper.updateDept(dept);
    }

    /**
     * 批量删除区域信息
     * 
     * @param deptIds 需要删除的区域信息主键
     * @return 结果
     */
    @Override
    public int deleteDeptByDeptIds(Long[] deptIds)
    {
        return deptMapper.deleteDeptByDeptIds(deptIds);
    }

    /**
     * 删除区域信息信息
     * 
     * @param deptId 区域信息主键
     * @return 结果
     */
    @Override
    public int deleteDeptByDeptId(Long deptId)
    {
        return deptMapper.deleteDeptByDeptId(deptId);
    }
}
