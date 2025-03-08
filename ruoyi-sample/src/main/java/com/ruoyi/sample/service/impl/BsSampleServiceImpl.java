package com.ruoyi.sample.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.sample.mapper.BsSampleMapper;
import com.ruoyi.sample.domain.BsSample;
import com.ruoyi.sample.service.IBsSampleService;

/**
 * 标本信息，用来存储标本信息的Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-15
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class BsSampleServiceImpl implements IBsSampleService
{
    @Autowired
    private BsSampleMapper bsSampleMapper;

    /**
     * 查询标本信息，用来存储标本信息的
     *
     * @param sampleId 标本信息，用来存储标本信息的主键
     * @return 标本信息，用来存储标本信息的
     */
    @Override
    public BsSample selectBsSampleBySampleId(Long sampleId)
    {
        return bsSampleMapper.selectBsSampleBySampleId(sampleId);
    }

    /**
     * 查询标本信息，用来存储标本信息的列表
     *
     * @param bsSample 标本信息，用来存储标本信息的
     * @return 标本信息，用来存储标本信息的
     */
    @Override
    public List<BsSample> selectBsSampleList(BsSample bsSample)
    {
        return bsSampleMapper.selectBsSampleList(bsSample);
    }

    /**
     * 新增标本信息，用来存储标本信息的
     *
     * @param bsSample 标本信息，用来存储标本信息的
     * @return 结果
     */
    @Override
    public int insertBsSample(BsSample bsSample)
    {
        bsSample.setCreateTime(DateUtils.getNowDate());
        return bsSampleMapper.insertBsSample(bsSample);
    }

    /**
     * 修改标本信息，用来存储标本信息的
     *
     * @param bsSample 标本信息，用来存储标本信息的
     * @return 结果
     */
    @Override
    public int updateBsSample(BsSample bsSample)
    {
        bsSample.setUpdateTime(DateUtils.getNowDate());
        return bsSampleMapper.updateBsSample(bsSample);
    }

    /**
     * 批量删除标本信息，用来存储标本信息的
     *
     * @param sampleIds 需要删除的标本信息，用来存储标本信息的主键
     * @return 结果
     */
    @Override
    public int deleteBsSampleBySampleIds(Long[] sampleIds)
    {
        return bsSampleMapper.deleteBsSampleBySampleIds(sampleIds);
    }

    /**
     * 按标本类型统计样本数量
     *
     * @return 按标本类型统计的样本数量列表
     */
    @Override
    public List<Map<String, Object>> countBsSampleByDept()
    {
        return bsSampleMapper.countBsSampleByDept();
    }

    /**
     * 删除标本信息，用来存储标本信息的信息
     *
     * @param sampleId 标本信息，用来存储标本信息的主键
     * @return 结果
     */
    @Override
    public int deleteBsSampleBySampleId(Long sampleId)
    {
        return bsSampleMapper.deleteBsSampleBySampleId(sampleId);
    }


}
