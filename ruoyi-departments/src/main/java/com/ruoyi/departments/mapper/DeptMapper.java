package com.ruoyi.departments.mapper;

import java.util.List;
import com.ruoyi.departments.domain.Dept;

/**
 * 区域信息Mapper接口
 * 
 * @author NIGHTLOS
 * @date 2025-03-03
 */
public interface DeptMapper 
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
     * 删除区域信息
     * 
     * @param deptId 区域信息主键
     * @return 结果
     */
    public int deleteDeptByDeptId(Long deptId);

    /**
     * 批量删除区域信息
     * 
     * @param deptIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeptByDeptIds(Long[] deptIds);
}
