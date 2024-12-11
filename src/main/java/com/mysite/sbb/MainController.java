package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public int home() {
        System.out.println("home");
        return 22;
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        System.out.println("about");
        return "안녕하세요.";
    }

    public void contact() {
        System.out.println("contact");
    }
}
    //혹시 무슨 차이가 있었떤 건가요?
    //기존의 자바 클래스나 파일들은 실행할때 의존성이 없어서 각각의 파일과 클래스별로 실행이 되었지만.
    //스프링 부트는 프로그램의 진입점이 SbbApplication으로 정해져있어서 그렇습니다.
    //테스트 하실려면 저친구를 실행시켜주셔야됩니다 넵감사합니다
