package com.example.demo.Controller;

import com.example.demo.Model.GoldenCow;
import com.example.demo.Model.LoginAttempt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private List<GoldenCow> cows = new ArrayList<>();

    @GetMapping({ "/", "/index.html"})
    public String index(){
        return "index";
    }

    @GetMapping("/bank.html")
    public String bank(HttpSession session, Model model){
        Object status = session.getAttribute("cowstatus");
        if(status != null){
            System.out.println("er logget ind");
            model.addAttribute("brugere", cows);
            return "bank";
        }else {
            System.out.println("er ikke logget ind");
        }
        return "redirect:/index.html";
    }

    @PostMapping("/addUser")
    public String addUser(GoldenCow cow){
        System.out.println("har modtaget cow: " + cow);
        cows.add(cow);
        return "redirect:/bank.html";
    }

    @PostMapping("/login")
    public String login(LoginAttempt loginAttempt, HttpSession session){

        if(checkUser(loginAttempt)) // hvis man har indtastet korrekte br. oplysning
        {
            session.setAttribute("cowstatus", "bruger");
            return "redirect:/bank.html";
        }else {
            session.removeAttribute("cowstatus");
        }
        return "redirect:/index.html";
    }

    private boolean checkUser(LoginAttempt loginAttempt){
        return loginAttempt.getPassword().equals("12345");
    }


}