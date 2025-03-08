package com.ruoyi.patients.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.patients.mapper.BsPatientMapper;
import com.ruoyi.patients.domain.BsPatient;
import com.ruoyi.patients.service.IBsPatientService;

/**
 * 患者信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-01
 */
@Service
public class BsPatientServiceImpl implements IBsPatientService 
{
    @Autowired
    private BsPatientMapper bsPatientMapper;

    /**
     * 查询患者信息
     * 
     * @param patientId 患者信息主键
     * @return 患者信息
     */
    @Override
    public BsPatient selectBsPatientByPatientId(Long patientId)
    {
        return bsPatientMapper.selectBsPatientByPatientId(patientId);
    }

    /**
     * 查询患者信息列表
     * 
     * @param bsPatient 患者信息
     * @return 患者信息
     */
    @Override
    public List<BsPatient> selectBsPatientList(BsPatient bsPatient)
    {
        return bsPatientMapper.selectBsPatientList(bsPatient);
    }

    /**
     * 新增患者信息
     * 
     * @param bsPatient 患者信息
     * @return 结果
     */
    @Override
    public int insertBsPatient(BsPatient bsPatient)
    {
        bsPatient.setCreateTime(DateUtils.getNowDate());
        return bsPatientMapper.insertBsPatient(bsPatient);
    }

    /**
     * 修改患者信息
     * 
     * @param bsPatient 患者信息
     * @return 结果
     */
    @Override
    public int updateBsPatient(BsPatient bsPatient)
    {
        bsPatient.setUpdateTime(DateUtils.getNowDate());
        return bsPatientMapper.updateBsPatient(bsPatient);
    }

    /**
     * 批量删除患者信息
     * 
     * @param patientIds 需要删除的患者信息主键
     * @return 结果
     */
    @Override
    public int deleteBsPatientByPatientIds(Long[] patientIds)
    {
        return bsPatientMapper.deleteBsPatientByPatientIds(patientIds);
    }

    /**
     * 删除患者信息信息
     * 
     * @param patientId 患者信息主键
     * @return 结果
     */
    @Override
    public int deleteBsPatientByPatientId(Long patientId)
    {
        return bsPatientMapper.deleteBsPatientByPatientId(patientId);
    }
}
