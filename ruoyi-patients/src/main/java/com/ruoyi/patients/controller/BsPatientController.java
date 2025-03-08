package com.ruoyi.patients.controller;

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
import com.ruoyi.patients.domain.BsPatient;
import com.ruoyi.patients.service.IBsPatientService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 患者信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-01
 */
@RestController
@RequestMapping("/patients/patientManage")
public class BsPatientController extends BaseController
{
    @Autowired
    private IBsPatientService bsPatientService;

    /**
     * 查询患者信息列表
     */
    @PreAuthorize("@ss.hasPermi('patients:patientManage:list')")
    @GetMapping("/list")
    public TableDataInfo list(BsPatient bsPatient)
    {
        startPage();
        List<BsPatient> list = bsPatientService.selectBsPatientList(bsPatient);
        return getDataTable(list);
    }

    /**
     * 导出患者信息列表
     */
    @PreAuthorize("@ss.hasPermi('patients:patientManage:export')")
    @Log(title = "患者信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BsPatient bsPatient)
    {
        List<BsPatient> list = bsPatientService.selectBsPatientList(bsPatient);
        ExcelUtil<BsPatient> util = new ExcelUtil<BsPatient>(BsPatient.class);
        util.exportExcel(response, list, "患者信息数据");
    }

    /**
     * 获取患者信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('patients:patientManage:query')")
    @GetMapping(value = "/{patientId}")
    public AjaxResult getInfo(@PathVariable("patientId") Long patientId)
    {
        return success(bsPatientService.selectBsPatientByPatientId(patientId));
    }

    /**
     * 新增患者信息
     */
    @PreAuthorize("@ss.hasPermi('patients:patientManage:add')")
    @Log(title = "患者信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BsPatient bsPatient)
    {
        return toAjax(bsPatientService.insertBsPatient(bsPatient));
    }

    /**
     * 修改患者信息
     */
    @PreAuthorize("@ss.hasPermi('patients:patientManage:edit')")
    @Log(title = "患者信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BsPatient bsPatient)
    {
        return toAjax(bsPatientService.updateBsPatient(bsPatient));
    }

    /**
     * 删除患者信息
     */
    @PreAuthorize("@ss.hasPermi('patients:patientManage:remove')")
    @Log(title = "患者信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{patientIds}")
    public AjaxResult remove(@PathVariable Long[] patientIds)
    {
        return toAjax(bsPatientService.deleteBsPatientByPatientIds(patientIds));
    }
}
