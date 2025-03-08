package com.ruoyi.departments.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.departments.domain.Dept;
import com.ruoyi.departments.service.IDeptService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 区域信息Controller
 * 
 * @author NIGHTLOS
 * @date 2025-03-03
 */
@RestController
@RequestMapping("/departments/deptManage")
public class DeptController extends BaseController
{
    @Autowired
    private IDeptService deptService;

    /**
     * 查询区域信息列表
     */
    @PreAuthorize("@ss.hasPermi('departments:deptManage:list')")
    @GetMapping("/list")
    public AjaxResult list(Dept dept)
    {
        List<Dept> list = deptService.selectDeptList(dept);
        return success(list);
    }

    /**
     * 导出区域信息列表
     */
    @PreAuthorize("@ss.hasPermi('departments:deptManage:export')")
    @Log(title = "区域信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Dept dept)
    {
        List<Dept> list = deptService.selectDeptList(dept);
        ExcelUtil<Dept> util = new ExcelUtil<Dept>(Dept.class);
        util.exportExcel(response, list, "区域信息数据");
    }

    /**
     * 获取区域信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('departments:deptManage:query')")
    @GetMapping(value = "/{deptId}")
    public AjaxResult getInfo(@PathVariable("deptId") Long deptId)
    {
        return success(deptService.selectDeptByDeptId(deptId));
    }

    /**
     * 新增区域信息
     */
    @PreAuthorize("@ss.hasPermi('departments:deptManage:add')")
    @Log(title = "区域信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Dept dept)
    {
        return toAjax(deptService.insertDept(dept));
    }

    /**
     * 修改区域信息
     */
    @PreAuthorize("@ss.hasPermi('departments:deptManage:edit')")
    @Log(title = "区域信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Dept dept)
    {
        return toAjax(deptService.updateDept(dept));
    }

    /**
     * 删除区域信息
     */
    @PreAuthorize("@ss.hasPermi('departments:deptManage:remove')")
    @Log(title = "区域信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deptIds}")
    public AjaxResult remove(@PathVariable Long[] deptIds)
    {
        return toAjax(deptService.deleteDeptByDeptIds(deptIds));
    }
}
