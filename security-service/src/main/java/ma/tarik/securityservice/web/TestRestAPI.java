package ma.tarik.securityservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestRestAPI {
    @GetMapping("/dataTest")
    public Map<String, Object> dataTest() {
        return Map.of("message", "Data test");
    }
}
