package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/api/hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return String.format("Hello %s!", name);
    }
}
