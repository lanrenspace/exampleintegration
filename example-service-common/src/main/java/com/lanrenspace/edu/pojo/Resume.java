package com.lanrenspace.edu.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Create by HeLongJun on 2022/2/12 17:17
 *
 * @author lanrenspace@163.com
 * @Description:
 */
@Data
@Entity
@Table(name = "r_resume")
public class Resume {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 工作年限
     */
    private String workYear;

    /**
     * 手机号
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * 目前状态
     */
    private String status;


    /**
     * 简历名称
     */
    private String resumeName;


    /**
     * 姓名
     */
    private String name;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 头像
     */
    private String headPic;

    /**
     * 是否删除
     */
    private Integer isDel;

    /**
     * 更新简历时间
     */
    private String updateTime;


    /**
     * 用户ID
     */
    private Long userId;


    /**
     * 是否默认简历
     */
    private Integer isDefault;


    /**
     * 最高学历
     */
    private String highestEducation;


    private Integer deliverNearByConfirm;

    private Integer refuseCount;

    private Integer markCanInterviewCount;

    private Integer haveNoticeInterCount;

    private String oneWord;


    private String liveCity;

    private Integer resumeScore;

    private Integer userIdentity;

    private Integer isOpenResume;
}
