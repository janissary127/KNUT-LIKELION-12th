package org.LLManagement.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("hello")
    public String home(){
/*        DatabaseModel a = new DatabaseModel();
        try {
            a.testConnection();
            return"hel2lo";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        return "index";

    }
}
