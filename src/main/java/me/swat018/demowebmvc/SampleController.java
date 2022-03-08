package me.swat018.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SampleController {

    @GetMapping(
            value = "/hello",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
