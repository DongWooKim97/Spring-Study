package ll.advancedsb.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String showMain() {
        return "<h1>Hello, SB!!! 반영되었습니다.</h1>";
    }
}
