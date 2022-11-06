package come.oyo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getHelloWord() {
        return "Hello Sunil Kumar";
    }

    @PostMapping("/time")
    public String testPost() {
        return "Current time is" + new Date();
    }





}
