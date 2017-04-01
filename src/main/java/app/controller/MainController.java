package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
    @RequestMapping(value = "home")
    public String getHome(){
        return "homepage";
    }
    
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "test complete";
    }
    
    @RequestMapping(value = "/test2")
    @ResponseBody
    public String test2(){
        return "test2 complete";
    }
    
}
