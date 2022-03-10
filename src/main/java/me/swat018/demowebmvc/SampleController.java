package me.swat018.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

//    @GetMapping("/events/{id}")
//    @ResponseBody
//    public Event getEvent(@PathVariable Integer id){
//        Event event = new Event();
//        event.setId(id);
//        return event;
//    }
    @GetMapping("/events/{id}")
    @ResponseBody
    public Event getEvent(@PathVariable("id") Integer idValue, @MatrixVariable String name){
        Event event = new Event();
        event.setId(idValue);
        event.setName(name);
        return event;
    }
}
