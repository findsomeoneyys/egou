package com.ys.egou.Controller.user;

import com.ys.egou.dto.UserLoginForm;
import com.ys.egou.dto.UserRegisterForm;
import com.ys.egou.model.user.User;
import com.ys.egou.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("")
    public String index(Model model, HttpSession httpSession) {
        model.addAttribute("users", userService.findAll());
        Boolean isLogin = (Boolean) httpSession.getAttribute("isLogin");
        logger.info("user is login :" + isLogin);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        UserLoginForm form = new UserLoginForm();
        model.addAttribute("form", form);
        return "login";

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginPost(UserLoginForm form,
                                  ModelAndView mv,
                                  BindingResult result,
                                  HttpSession httpSession) {
        if (result.hasErrors()) {
            return mv;
        }
        String account = form.getEmail();
        String password = form.getPassword();
        Boolean remember = form.getRemember();

        User user = userService.login(account, password);
        if (user == null) {
            mv.setViewName("login");
            mv.addObject("form", form);
            mv.addObject("loginError", "账号或者密码错误!");
            return mv;
        }
        httpSession.setAttribute("isLogin", true);

        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerGet(UserRegisterForm userRegisterForm) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registerPost(@Valid UserRegisterForm userRegisterForm, ModelAndView mv, BindingResult result) {
        if (result.hasErrors()) {
            return mv;
        }

        Boolean r = userService.register(userRegisterForm);
        return new ModelAndView("redirect:/");
    }


}
