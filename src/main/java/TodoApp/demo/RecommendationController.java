package TodoApp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    @GetMapping("/")
    public String helloworld(){
        return "To-do Application !";
    }
}
