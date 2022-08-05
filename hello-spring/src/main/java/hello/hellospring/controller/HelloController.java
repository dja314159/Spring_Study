package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
public class HelloController
{
    @GetMapping("hello")
    public String hello(Model model)
    {
        model.addAttribute("data" ,"hello!!");//이건 return하는 문자열 이름을 가진 파일의 data 부분에 Value를 넣는거임
        return "hello";//이건 파일 이름

    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

}
