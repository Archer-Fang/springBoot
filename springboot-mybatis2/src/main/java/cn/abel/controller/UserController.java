package cn.abel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import cn.abel.bean.User;
import cn.abel.service.UserService;

@RequestMapping(value="/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<User> list(HttpServletRequest request){
        return userService.getByMap(null);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User detail(@PathVariable Integer id){
        return userService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(@PathVariable Integer id){
        return userService.delete(id);
    }

}