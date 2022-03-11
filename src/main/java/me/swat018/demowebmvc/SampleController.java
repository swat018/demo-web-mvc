package me.swat018.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class SampleController {

    @PostMapping("/events")
    @ResponseBody
    public Event getEvent(@RequestParam Map<String, String> params, @RequestParam Integer limit){
        Event event = new Event();
        event.setName(params.get("name"));
        event.setLimit(limit);
        return event;
    }
}
