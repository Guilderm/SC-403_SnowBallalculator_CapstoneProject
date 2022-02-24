package dev.guilder.sc403_desaapliweb_finalproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userManagement {
    @GetMapping("/login")
    public String loginPage() {
        return "userManagement/login";
    }

    @GetMapping("/profile")
    public String profileDashboard() {
        return "userManagement/profile";
    }

    @GetMapping("/userSignUp")
    public String userSignUpPage() {
        return "userManagement/userSignUp";
    }
}
