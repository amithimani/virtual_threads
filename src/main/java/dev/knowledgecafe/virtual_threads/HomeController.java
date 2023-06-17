package dev.knowledgecafe.virtual_threads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    HomeService homeService;
    @GetMapping("/home")
    public String getResponse(){

       return homeService.getResponse();
    }
}
