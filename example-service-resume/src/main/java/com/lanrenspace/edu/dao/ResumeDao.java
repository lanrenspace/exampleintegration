package com.lanrenspace.edu.dao;

import com.lanrenspace.edu.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by HeLongJun on 2022/2/12 17:24
 *
 * @author lanrenspace@163.com
 * @Description:
 */
public interface ResumeDao extends JpaRepository<Resume, Long> {
}
