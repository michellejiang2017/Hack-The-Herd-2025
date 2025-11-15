@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home";  // home.html
    }

    @GetMapping("/rides")
    public String ridesPage(Model model) {
        model.addAttribute("rides", new ArrayList<>()); // placeholder
        return "rides";  // rides.html
    }

    @GetMapping("/users/profile")
    public String profilePage(Model model) {
        model.addAttribute("user", new User("Jane Doe", "jane@example.com", "rider"));
        return "profile"; // profile.html
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // login.html
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register"; // register.html
    }
}
