package metodologiasagiles.metodologiasagiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/HelloWorld")
    public String hello() {
        return "HelloWorld";
    }
}
