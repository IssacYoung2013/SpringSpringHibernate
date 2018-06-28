package com.issac.ssh.model;

import java.util.List;

/**
 *
 * author:  ywy
 * date:  2018-06-28
 * desc:
 *
 */
public class Course {
    /**
    * 课程id
    */
    private int courseId;

    /**
    * 课程名称
    */
    private String title;

    /**
    * 图片路径
    */
    private String imgPath;

    /**
    * 学习人数
    */
    private int learningNum;

    /**
     * 课程时长
     */
    private Long duration;

    /**
    * 课程难度
    */
    private int level;

    /**
    * 课程难度描述
    */
    private String levelDesc;

    /**
    * 课程介绍
    */
    private String descr;

    private List<Chapter> chapterList;

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getLearningNum() {
        return learningNum;
    }

    public void setLearningNum(int learningNum) {
        this.learningNum = learningNum;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelDesc() {
        return levelDesc;
    }

    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}