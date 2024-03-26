package org.LLManagement.Controllers;

import org.LLManagement.Models.LLLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("/login2")
    public String login(@RequestParam("userName") String username, @RequestParam("userPassword") String userpassword) {
        LLLogin llLogin = new LLLogin();
        if(llLogin.login(Integer.parseInt(username), Integer.parseInt(userpassword)))
            System.out.println("로그인 성공");
        else 
            System.out.println("로그인 실패");
        return "index";
    }
}
