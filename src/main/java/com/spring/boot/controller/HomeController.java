package com.spring.boot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //html은 views에 있는 파일을 클라이언트가 바로 호출 못한다.
    @RequestMapping("/")
    public String dologin() {
        return "redirect:/login.jsp";
    }



//    @RequestMapping("/studyreg")
//    public String dostudyreg() {
//        return "/WEB-INF/views/studyreg.jsp";
//    }

//    @RequestMapping("/home")
//    public String dohome2() {
//        return "redirect:/WEB-INF/views/hello.html";
//    }
//    //views와 WEB-INF밑에 같이 있지만 base는 가능하다
//    @RequestMapping("/home3")
//    public String dohome3() {
//        return "redirect:/base/hello.html";
//    }

}
