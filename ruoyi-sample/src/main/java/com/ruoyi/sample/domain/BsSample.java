package com.ruoyi.sample.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 标本信息，用来存储标本信息的对象 bs_sample
 * 
 * @author ruoyi
 * @date 2025-01-15
 */
public class BsSample extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 样本的自增主键 */
    private Long sampleId;

    /** 通用唯一识别码 */
    @Excel(name = "通用唯一识别码")
    private String sampleUuid;

    /** 样本编号，外显 */
    @Excel(name = "样本编号，外显")
    private String sampleMrid;

    /** 样本检测类型 */
    @Excel(name = "样本检测类型")
    private String sampleType;

    /** 扫描设备类型 */
    @Excel(name = "扫描设备类型")
    private String scanDeviceType;

    /** 患者身份证号 */
    @Excel(name = "患者身份证号")
    private String patientIdCard;

    /** 送检机构id */
    @Excel(name = "送检机构id")
    private Long deptId;

    /** 标本的采样时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "标本的采样时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sampleSampleDate;

    /** 标本的送检时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "标本的送检时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sampleSendDate;

    /** 样本组织类型 */
    @Excel(name = "样本组织类型")
    private String samplePathologyType;

    /** 标本将要出具的报告类型，如tct报告 */
    @Excel(name = "标本将要出具的报告类型，如tct报告")
    private String reportType;

    /** 样本状态标志位 */
    @Excel(name = "样本状态标志位")
    private String sampleStatus;

    /** 上传者id（同创建者） */
    @Excel(name = "上传者id", readConverterExp = "同=创建者")
    private Long uploadId;

    /** 诊断者id */
    @Excel(name = "诊断者id")
    private Long diagnoseId;

    /** 复核者id */
    @Excel(name = "复核者id")
    private Long reviewId;

    /** 样本图像的路径 */
    @Excel(name = "样本图像的路径")
    private String sampleImgPath;

    /** AI推荐诊断结果, 0-阴性, 1-阳性 */
    @Excel(name = "AI推荐诊断结果, 0-阴性, 1-阳性")
    private String wsiClassificationRecommend;

    /** AI推荐诊断结果路径（.json） */
    @Excel(name = "AI推荐诊断结果路径", readConverterExp = ".=json")
    private String wsiClassificationPath;

    /** 医生诊断结果路径（.json） */
    @Excel(name = "医生诊断结果路径", readConverterExp = ".=json")
    private String diagnosePath;

    /** 报告路径 */
    @Excel(name = "报告路径")
    private String reportPath;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSampleId(Long sampleId) 
    {
        this.sampleId = sampleId;
    }

    public Long getSampleId() 
    {
        return sampleId;
    }
    public void setSampleUuid(String sampleUuid) 
    {
        this.sampleUuid = sampleUuid;
    }

    public String getSampleUuid() 
    {
        return sampleUuid;
    }
    public void setSampleMrid(String sampleMrid) 
    {
        this.sampleMrid = sampleMrid;
    }

    public String getSampleMrid() 
    {
        return sampleMrid;
    }
    public void setSampleType(String sampleType) 
    {
        this.sampleType = sampleType;
    }

    public String getSampleType() 
    {
        return sampleType;
    }
    public void setScanDeviceType(String scanDeviceType) 
    {
        this.scanDeviceType = scanDeviceType;
    }

    public String getScanDeviceType() 
    {
        return scanDeviceType;
    }
    public void setPatientIdCard(String patientIdCard) 
    {
        this.patientIdCard = patientIdCard;
    }

    public String getPatientIdCard() 
    {
        return patientIdCard;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setSampleSampleDate(Date sampleSampleDate) 
    {
        this.sampleSampleDate = sampleSampleDate;
    }

    public Date getSampleSampleDate() 
    {
        return sampleSampleDate;
    }
    public void setSampleSendDate(Date sampleSendDate) 
    {
        this.sampleSendDate = sampleSendDate;
    }

    public Date getSampleSendDate() 
    {
        return sampleSendDate;
    }
    public void setSamplePathologyType(String samplePathologyType) 
    {
        this.samplePathologyType = samplePathologyType;
    }

    public String getSamplePathologyType() 
    {
        return samplePathologyType;
    }
    public void setReportType(String reportType) 
    {
        this.reportType = reportType;
    }

    public String getReportType() 
    {
        return reportType;
    }
    public void setSampleStatus(String sampleStatus) 
    {
        this.sampleStatus = sampleStatus;
    }

    public String getSampleStatus() 
    {
        return sampleStatus;
    }
    public void setUploadId(Long uploadId) 
    {
        this.uploadId = uploadId;
    }

    public Long getUploadId() 
    {
        return uploadId;
    }
    public void setDiagnoseId(Long diagnoseId) 
    {
        this.diagnoseId = diagnoseId;
    }

    public Long getDiagnoseId() 
    {
        return diagnoseId;
    }
    public void setReviewId(Long reviewId) 
    {
        this.reviewId = reviewId;
    }

    public Long getReviewId() 
    {
        return reviewId;
    }
    public void setSampleImgPath(String sampleImgPath) 
    {
        this.sampleImgPath = sampleImgPath;
    }

    public String getSampleImgPath() 
    {
        return sampleImgPath;
    }
    public void setWsiClassificationRecommend(String wsiClassificationRecommend) 
    {
        this.wsiClassificationRecommend = wsiClassificationRecommend;
    }

    public String getWsiClassificationRecommend() 
    {
        return wsiClassificationRecommend;
    }
    public void setWsiClassificationPath(String wsiClassificationPath) 
    {
        this.wsiClassificationPath = wsiClassificationPath;
    }

    public String getWsiClassificationPath() 
    {
        return wsiClassificationPath;
    }
    public void setDiagnosePath(String diagnosePath) 
    {
        this.diagnosePath = diagnosePath;
    }

    public String getDiagnosePath() 
    {
        return diagnosePath;
    }
    public void setReportPath(String reportPath) 
    {
        this.reportPath = reportPath;
    }

    public String getReportPath() 
    {
        return reportPath;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sampleId", getSampleId())
            .append("sampleUuid", getSampleUuid())
            .append("sampleMrid", getSampleMrid())
            .append("sampleType", getSampleType())
            .append("scanDeviceType", getScanDeviceType())
            .append("patientIdCard", getPatientIdCard())
            .append("deptId", getDeptId())
            .append("sampleSampleDate", getSampleSampleDate())
            .append("sampleSendDate", getSampleSendDate())
            .append("samplePathologyType", getSamplePathologyType())
            .append("reportType", getReportType())
            .append("sampleStatus", getSampleStatus())
            .append("uploadId", getUploadId())
            .append("diagnoseId", getDiagnoseId())
            .append("reviewId", getReviewId())
            .append("sampleImgPath", getSampleImgPath())
            .append("wsiClassificationRecommend", getWsiClassificationRecommend())
            .append("wsiClassificationPath", getWsiClassificationPath())
            .append("diagnosePath", getDiagnosePath())
            .append("reportPath", getReportPath())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
