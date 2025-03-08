package com.ruoyi.departments.service;

import java.util.List;
import com.ruoyi.departments.domain.Dept;

/**
 * 区域信息Service接口
 * 
 * @author NIGHTLOS
 * @date 2025-03-03
 */
public interface IDeptService 
{
    /**
     * 查询区域信息
     * 
     * @param deptId 区域信息主键
     * @return 区域信息
     */
    public Dept selectDeptByDeptId(Long deptId);

    /**
     * 查询区域信息列表
     * 
     * @param dept 区域信息
     * @return 区域信息集合
     */
    public List<Dept> selectDeptList(Dept dept);

    /**
     * 新增区域信息
     * 
     * @param dept 区域信息
     * @return 结果
     */
    public int insertDept(Dept dept);

    /**
     * 修改区域信息
     * 
     * @param dept 区域信息
     * @return 结果
     */
    public int updateDept(Dept dept);

    /**
     * 批量删除区域信息
     * 
     * @param deptIds 需要删除的区域信息主键集合
     * @return 结果
     */
    public int deleteDeptByDeptIds(Long[] deptIds);

    /**
     * 删除区域信息信息
     * 
     * @param deptId 区域信息主键
     * @return 结果
     */
    public int deleteDeptByDeptId(Long deptId);
}
