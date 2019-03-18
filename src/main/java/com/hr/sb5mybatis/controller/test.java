package com.hr.sb5mybatis.controller;

import com.hr.sb5mybatis.entity.Person;
import com.hr.sb5mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/lhl")
public class test {

    @Autowired
    private PersonService ps;


    @RequestMapping("/queryAll")
    public ModelAndView queryAll(){

        List<Person> list = ps.queryAll();
        ModelAndView view = new ModelAndView("/list");
        view.addObject("list",list);
        return  view;
    }

    @RequestMapping("/add")
    public ModelAndView add(){
        Person person = new Person();
        person.setpName("lhl");
        person.setBirthDay(new Date());
        ps.add(person);
        ModelAndView view = new ModelAndView("/list");
        return  view;
    }
}
