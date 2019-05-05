package com.ys.egou.Controller.user;

import com.ys.egou.model.user.User;
import com.ys.egou.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("users", userService.findAll());
        return "index";

    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerGet(User user) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registerPost(@Valid User user, ModelAndView mv, BindingResult result) {
        if (result.hasErrors()) {
            return mv;
        }

        Boolean r = userService.register(user);
        return new ModelAndView("redirect:/");
    }


}
