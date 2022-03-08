package me.swat018.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class SampleController {

//    @GetMapping({"/hello","/hi"})
//    @GetMapping("/{name:[a-z]+}")
    @GetMapping("/jinwoo")
    @ResponseBody
    public String hellojinwoo() {
        return "hello jinwoo";
    }
    @GetMapping("/**")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
