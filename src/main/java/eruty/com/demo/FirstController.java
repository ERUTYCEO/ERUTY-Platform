package eruty.com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/serverAuth")
    public String test() {
        return "Hello, world!";
    }
}