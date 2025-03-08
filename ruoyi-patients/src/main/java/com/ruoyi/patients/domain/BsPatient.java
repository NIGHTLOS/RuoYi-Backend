package com.ruoyi.patients.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者信息对象 bs_patient
 * 
 * @author ruoyi
 * @date 2025-03-01
 */
public class BsPatient extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 患者自增标号 */
    private Long patientId;

    /** 通用唯一标识码 */
    @Excel(name = "通用唯一标识码")
    private String patientUuid;

    /** 患者病理号 */
    @Excel(name = "患者病理号")
    private String patientMrid;

    /** 患者姓名 */
    @Excel(name = "患者姓名")
    private String patientName;

    /** 患者手机号 */
    @Excel(name = "患者手机号")
    private String phonenumber;

    /** 患者年龄 */
    @Excel(name = "患者年龄")
    private Long age;

    /** 患者出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "患者出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 患者性别 */
    @Excel(name = "患者性别")
    private String patientGender;

    /** 患者身份证号 */
    @Excel(name = "患者身份证号")
    private String patientIdCard;

    /** 患者历史病历 */
    @Excel(name = "患者历史病历")
    private String patientMedicalRecords;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 所属机构ID */
    @Excel(name = "所属机构ID")
    private Long belongDept;

    public void setPatientId(Long patientId) 
    {
        this.patientId = patientId;
    }

    public Long getPatientId() 
    {
        return patientId;
    }
    public void setPatientUuid(String patientUuid) 
    {
        this.patientUuid = patientUuid;
    }

    public String getPatientUuid() 
    {
        return patientUuid;
    }
    public void setPatientMrid(String patientMrid) 
    {
        this.patientMrid = patientMrid;
    }

    public String getPatientMrid() 
    {
        return patientMrid;
    }
    public void setPatientName(String patientName) 
    {
        this.patientName = patientName;
    }

    public String getPatientName() 
    {
        return patientName;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setPatientGender(String patientGender) 
    {
        this.patientGender = patientGender;
    }

    public String getPatientGender() 
    {
        return patientGender;
    }
    public void setPatientIdCard(String patientIdCard) 
    {
        this.patientIdCard = patientIdCard;
    }

    public String getPatientIdCard() 
    {
        return patientIdCard;
    }
    public void setPatientMedicalRecords(String patientMedicalRecords) 
    {
        this.patientMedicalRecords = patientMedicalRecords;
    }

    public String getPatientMedicalRecords() 
    {
        return patientMedicalRecords;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setBelongDept(Long belongDept) 
    {
        this.belongDept = belongDept;
    }

    public Long getBelongDept() 
    {
        return belongDept;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("patientId", getPatientId())
            .append("patientUuid", getPatientUuid())
            .append("patientMrid", getPatientMrid())
            .append("patientName", getPatientName())
            .append("phonenumber", getPhonenumber())
            .append("age", getAge())
            .append("birthday", getBirthday())
            .append("patientGender", getPatientGender())
            .append("patientIdCard", getPatientIdCard())
            .append("patientMedicalRecords", getPatientMedicalRecords())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("belongDept", getBelongDept())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
