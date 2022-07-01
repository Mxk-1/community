package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
//    测试访问跳转
    // 请求参数 @RequestParam
    // 通过 url/hello?name=xxx 访问
    /*public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }*/

    public String hello() {
//        访问templates中hello.html
        return "hello";
    }
}
