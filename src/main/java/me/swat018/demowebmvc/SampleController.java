package me.swat018.demowebmvc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

//    @GetMapping(value = "/hello", headers = "!" + HttpHeaders.FROM)
//    @GetMapping(value = "/hello", headers = HttpHeaders.AUTHORIZATION + "=" + "222")
    @GetMapping(value = "/hello", params = "name=jinwoo ")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
