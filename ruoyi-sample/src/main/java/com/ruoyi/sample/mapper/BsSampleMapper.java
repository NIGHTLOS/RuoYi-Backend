package com.ruoyi.sample.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.sample.domain.BsSample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 标本信息，用来存储标本信息的Mapper接口
 *
 * @author ruoyi
 * @date 2025-01-15
 */
@Mapper
public interface BsSampleMapper
{
    /**
     * 查询标本信息
     */
    public BsSample selectBsSampleBySampleId(Long sampleId);

    /**
     * 查询标本信息列表
     */
    public List<BsSample> selectBsSampleList(BsSample bsSample);

    /**
     * 新增标本信息
     */
    public int insertBsSample(BsSample bsSample);

    /**
     * 修改标本信息
     */
    public int updateBsSample(BsSample bsSample);

    /**
     * 删除标本信息
     */
    public int deleteBsSampleBySampleId(Long sampleId);

    /**
     * 批量删除标本信息
     */
    public int deleteBsSampleBySampleIds(Long[] sampleIds);

    /**
     * 按标本类型统计样本数量
     *
     * @return 按标本类型统计的样本数量列表
     */
    public List<Map<String, Object>> countBsSampleByDept();

}
