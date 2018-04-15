package com.ruoyi.project.monitor.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ruoyi.project.monitor.job.domain.JobLog;

/**
 * 调度任务日志信息 数据层
 * 
 * @author ruoyi
 */
@Mapper
public interface IJobLogDao
{

    /**
     * 获取quartz调度器日志的计划任务
     * 
     * @param jobLog 调度日志信息
     * @return 调度任务日志集合
     */
    public List<JobLog> selectJobLogList(JobLog jobLog);
    
    /**
     * 通过调度任务日志ID查询调度信息
     * 
     * @param jobId 调度任务日志ID
     * @return 调度任务日志对象信息
     */
    public JobLog selectJobLogById(Long jobLogId);

    /**
     * 新增任务日志
     * 
     * @param jobLog 调度日志信息
     */
    public int insertJobLog(JobLog jobLog);

    /**
     * 批量删除调度日志信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int batchDeleteJobLog(Long[] ids);

    /**
     * 删除任务日志
     * 
     * @param jobId 调度日志ID
     */
    public int deleteJobLogById(Long jobId);

}
