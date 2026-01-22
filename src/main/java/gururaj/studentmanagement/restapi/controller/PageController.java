package gururaj.studentmanagement.restapi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @GetMapping("/ping")
    @ResponseBody
    public String ping() {
        return "PING OK";
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
