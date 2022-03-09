package me.swat018.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EventUpdateController {

    @PostMapping("/events")
    @ResponseBody
    public String createEvent() {
        return "event";
    }

    @PutMapping("/events")
    @ResponseBody
    public String updateEvent() {
        return "event";
    }
}
