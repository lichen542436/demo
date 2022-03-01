package com.yixuan.contorller;

import com.yixuan.pojo.Users;
import com.yixuan.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UsersServiceImpl usersServiceImpl;

    @GetMapping("/user/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password
    , Model model, HttpSession session){
        List<Users> usersList = usersServiceImpl.userList();
        System.out.println(usersList.size());
        for(Users user : usersList){
            if (!StringUtils.isEmpty(email) && user.getUserPassword().equals(password)) {
                session.setAttribute("loginUser",email);
                return "redirect:../index.html   ";
            }else {
                model.addAttribute("msg","用户名或者密码错误！");
                return "login";
            }
        }
        return "login";
    }
}
