@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot!";
    }
}
