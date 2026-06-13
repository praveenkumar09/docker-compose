package com.tpkprav.job_service.service;

import com.tpkprav.job_service.dto.JobDto;
import com.tpkprav.job_service.repository.JobRepository;
import com.tpkprav.job_service.util.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;


    public Flux<JobDto> allJobs(){
        return  this
                .repository
                .findAll()
                .map(EntityDtoUtil::toDto);
    }

    public Flux<JobDto> jobsBySkills(Set<String> skills){
        return  this
                .repository
                .findBySkillsIn(skills)
                .map(EntityDtoUtil::toDto);
    }

    public Mono<JobDto> save(Mono<JobDto> mono){
        return mono
                .map(EntityDtoUtil::toEntity)
                .flatMap(this.repository::save)
                .map(EntityDtoUtil::toDto);

    }



}
