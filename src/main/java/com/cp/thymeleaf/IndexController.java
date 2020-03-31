package com.cp.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChengPeng
 * @create 2020-03-31 9:28
 */
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model){
        List<User> users = new ArrayList<>();
        for(int i = 0;i<10;i++){
            User u = new User();
            u.setId((long)i);
            u.setName("cp:" + i);
            u.setAddress("南京:" + i);
            users.add(u);
        }
        model.addAttribute("users",users);
        model.addAttribute("username","李四");
        return "index";
    }

    @GetMapping("/indexs")
    public String indexs(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("cp>>>>" + i);
            user.setAddress("www.gcp168.cn>>>>" + i);
            users.add(user);
        }
        model.addAttribute("users", users);
        return "index";
    }
}
