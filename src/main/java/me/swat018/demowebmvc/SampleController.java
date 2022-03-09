package me.swat018.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SampleController {

    @GetHelloMapping
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/events")
    @ResponseBody
    public String events() {
        return "events";
    }

    @GetMapping("/events/{id}")
    @ResponseBody
    public String getEvents(@PathVariable int id) {
        return "events";
    }

    @DeleteMapping("/events/{id}")
    @ResponseBody
    public String deleteEvents(@PathVariable int id) {
        return "events";
    }


}
