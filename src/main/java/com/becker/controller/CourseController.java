package com.becker.controller;

import com.becker.model.Course;
import com.becker.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor//constrói um construtor padrão
public class CourseController {


    private final CourseRepository courseRepository;


    @GetMapping
    public @ResponseBody List<Course> list(){

        return courseRepository.findAll();
    }


}
