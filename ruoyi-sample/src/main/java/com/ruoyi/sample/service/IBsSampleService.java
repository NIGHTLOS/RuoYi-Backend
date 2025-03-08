package com.ruoyi.sample.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.sample.domain.BsSample;

/**
 * 标本信息，用来存储标本信息的Service接口
 *
 * @author ruoyi
 * @date 2025-01-15
 */
public interface IBsSampleService
{
    /**
     * 查询标本信息，用来存储标本信息的
     *
     * @param sampleId 标本信息，用来存储标本信息的主键
     * @return 标本信息，用来存储标本信息的
     */
    public BsSample selectBsSampleBySampleId(Long sampleId);

    /**
     * 查询标本信息，用来存储标本信息的列表
     *
     * @param bsSample 标本信息，用来存储标本信息的
     * @return 标本信息，用来存储标本信息的集合
     */
    public List<BsSample> selectBsSampleList(BsSample bsSample);

    /**
     * 新增标本信息，用来存储标本信息的
     *
     * @param bsSample 标本信息，用来存储标本信息的
     * @return 结果
     */
    public int insertBsSample(BsSample bsSample);

    /**
     * 修改标本信息，用来存储标本信息的
     *
     * @param bsSample 标本信息，用来存储标本信息的
     * @return 结果
     */
    public int updateBsSample(BsSample bsSample);

    /**
     * 批量删除标本信息，用来存储标本信息的
     *
     * @param sampleIds 需要删除的标本信息，用来存储标本信息的主键集合
     * @return 结果
     */
    public int deleteBsSampleBySampleIds(Long[] sampleIds);

    /**
     * 删除标本信息，用来存储标本信息的信息
     *
     * @param sampleId 标本信息，用来存储标本信息的主键
     * @return 结果
     */
    public int deleteBsSampleBySampleId(Long sampleId);

    /**
     * 按标本类型统计样本数量
     *
     * @return 按标本类型统计的样本数量列表
     */
    public List<Map<String, Object>> countBsSampleByDept();

}
