package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.postService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("**** Home Controller *****");
    }

    @Autowired
    private postService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {

    List<Post> posts= postService.getAllPosts();

    model.addAttribute("posts", posts);
    return "index";
    }
}
