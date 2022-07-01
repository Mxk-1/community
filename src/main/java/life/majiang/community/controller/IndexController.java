package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
//    一个 / 代表根目录
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
