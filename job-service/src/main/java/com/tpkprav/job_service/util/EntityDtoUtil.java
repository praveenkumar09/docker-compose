package com.tpkprav.job_service.util;

import com.tpkprav.job_service.dto.JobDto;
import com.tpkprav.job_service.entity.Job;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {

    public static JobDto toDto(Job job){
        JobDto jobDto = new JobDto();
        BeanUtils.copyProperties(job,jobDto);
        return jobDto;
    }

    public static Job toEntity(JobDto jobDto){
        Job job = new Job();
        BeanUtils.copyProperties(jobDto,job);
        return job;
    }
}
