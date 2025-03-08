package com.ruoyi.sample.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.sample.domain.BsSample;
import com.ruoyi.sample.service.IBsSampleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 标本信息，用来存储标本信息的Controller
 *
 * @author ruoyi
 * @date 2025-01-15
 */
@RestController
@RequestMapping("/sample/sampleManage")
public class BsSampleController extends BaseController
{
    @Autowired
    private IBsSampleService bsSampleService;

    /**
     * 查询标本信息，用来存储标本信息的列表
     */
    @PreAuthorize("@ss.hasPermi('sample:sampleManage:list')")
    @GetMapping("/list")
    public TableDataInfo list(BsSample bsSample)
    {
        startPage();
        List<BsSample> list = bsSampleService.selectBsSampleList(bsSample);
        return getDataTable(list);
    }

    /**
     * 导出标本信息，用来存储标本信息的列表
     */
    @PreAuthorize("@ss.hasPermi('sample:sampleManage:export')")
    @Log(title = "标本信息，用来存储标本信息的", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BsSample bsSample)
    {
        List<BsSample> list = bsSampleService.selectBsSampleList(bsSample);
        ExcelUtil<BsSample> util = new ExcelUtil<BsSample>(BsSample.class);
        util.exportExcel(response, list, "标本信息，用来存储标本信息的数据");
    }

    /**
     * 获取标本信息，用来存储标本信息的详细信息
     */
    @PreAuthorize("@ss.hasPermi('sample:sampleManage:query')")
    @GetMapping(value = "/{sampleId}")
    public AjaxResult getInfo(@PathVariable("sampleId") Long sampleId)
    {
        return success(bsSampleService.selectBsSampleBySampleId(sampleId));
    }

    /**
     * 新增标本信息，用来存储标本信息的
     */
    @PreAuthorize("@ss.hasPermi('sample:sampleManage:add')")
    @Log(title = "标本信息，用来存储标本信息的", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BsSample bsSample)
    {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        Long userId = loginUser.getUser().getUserId();
        bsSample.setUploadId(userId);
        return toAjax(bsSampleService.insertBsSample(bsSample));
    }

    /**
     * 修改标本信息，用来存储标本信息的
     */
    @PreAuthorize("@ss.hasPermi('sample:sampleManage:edit')")
    @Log(title = "标本信息，用来存储标本信息的", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BsSample bsSample)
    {
        return toAjax(bsSampleService.updateBsSample(bsSample));
    }

    /**
     * 删除标本信息，用来存储标本信息的
     */
    @PreAuthorize("@ss.hasPermi('sample:sampleManage:remove')")
    @Log(title = "标本信息，用来存储标本信息的", businessType = BusinessType.DELETE)
    @DeleteMapping("/{sampleIds}")
    public AjaxResult remove(@PathVariable Long[] sampleIds)
    {
        return toAjax(bsSampleService.deleteBsSampleBySampleIds(sampleIds));
    }

    /**
     * 按标本类型统计样本数量
     */
    @GetMapping("/countByType")
    public AjaxResult countByType()
    {
        List<Map<String, Object>> result = bsSampleService.countBsSampleByDept();
        return AjaxResult.success(result);
    }

}
