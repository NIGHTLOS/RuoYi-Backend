package com.ruoyi.patients.service;

import java.util.List;
import com.ruoyi.patients.domain.BsPatient;

/**
 * 患者信息Service接口
 * 
 * @author ruoyi
 * @date 2025-03-01
 */
public interface IBsPatientService 
{
    /**
     * 查询患者信息
     * 
     * @param patientId 患者信息主键
     * @return 患者信息
     */
    public BsPatient selectBsPatientByPatientId(Long patientId);

    /**
     * 查询患者信息列表
     * 
     * @param bsPatient 患者信息
     * @return 患者信息集合
     */
    public List<BsPatient> selectBsPatientList(BsPatient bsPatient);

    /**
     * 新增患者信息
     * 
     * @param bsPatient 患者信息
     * @return 结果
     */
    public int insertBsPatient(BsPatient bsPatient);

    /**
     * 修改患者信息
     * 
     * @param bsPatient 患者信息
     * @return 结果
     */
    public int updateBsPatient(BsPatient bsPatient);

    /**
     * 批量删除患者信息
     * 
     * @param patientIds 需要删除的患者信息主键集合
     * @return 结果
     */
    public int deleteBsPatientByPatientIds(Long[] patientIds);

    /**
     * 删除患者信息信息
     * 
     * @param patientId 患者信息主键
     * @return 结果
     */
    public int deleteBsPatientByPatientId(Long patientId);
}
