package study.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @GetMapping("/template1")
    public String template1Page() {
        // 여기서 반환하는 문자열 "template1"은 응답 메시지의 바디에 포함될 문자열이 아니고, 렌더링할 파일의 이름("template1.html")임을 유의
        return "template1"; // 찾아야할 template 파일의 이름
    }

    @RequestMapping("/template2")
    public String template2(Model m) {
        // 모델 객체에 템플릿 엔진을 통해 출력할 정보를 추가
        m.addAttribute("value1", 100);
        m.addAttribute("value2", "Hello, Paragraph!");

        Book book = new Book("김철수", "부자되는 방법", 10000);
        // addAttribute 메서드의 두 번째 인자 타입은 Object이므로 아무 객체나 추가 가능
        m.addAttribute("mybook", book);

        return "template2";
    }
}
