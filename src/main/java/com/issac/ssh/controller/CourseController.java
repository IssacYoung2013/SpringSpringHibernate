package com.issac.ssh.controller;

import com.issac.ssh.model.Course;
import com.issac.ssh.service.Impl.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * author:  ywy
 * date:  2018-06-28
 * desc:
 *
 */
@Controller
@RequestMapping("/course")
// /course/**
public class CourseController {

    private static Logger log = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    // 本方法将处理 /course/view?courseId=123
    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Model model){
        log.debug("In viewCourse courseId={}",courseId);

        Course course = courseService.getCourseById(courseId);
        model.addAttribute(course);
        return "course_overview";
    }

}