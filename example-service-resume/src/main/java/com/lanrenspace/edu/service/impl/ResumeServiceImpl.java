package com.lanrenspace.edu.service.impl;

import com.lanrenspace.edu.dao.ResumeDao;
import com.lanrenspace.edu.pojo.Resume;
import com.lanrenspace.edu.service.ResumeService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create by HeLongJun on 2022/2/12 17:26
 *
 * @author lanrenspace@163.com
 * @Description:
 */
@Service
public class ResumeServiceImpl implements ResumeService {

    @Resource
    private ResumeDao resumeDao;

    @Override
    public Resume findDefaultResumeByUserId(Long userId) {
        Resume resume = new Resume();
        resume.setUserId(userId);
        resume.setIsDefault(1);
        return resumeDao.findOne(Example.of(resume)).get();
    }
}
