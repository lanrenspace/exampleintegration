package com.lanrenspace.edu.service;

import com.lanrenspace.edu.pojo.Resume;

/**
 * Create by HeLongJun on 2022/2/12 17:25
 *
 * @author lanrenspace@163.com
 * @Description:
 */
public interface ResumeService {

    Resume findDefaultResumeByUserId(Long userId);
}
