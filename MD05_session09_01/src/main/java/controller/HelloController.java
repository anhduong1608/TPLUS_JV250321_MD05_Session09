
package controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import entity.Students;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"/"})
public class HelloController {
    @GetMapping
    public String home(HttpSession session, Model model) {


        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students(1, "Nguyen Van A", 20, "CTK43", "a.nguyen@example.com", "Hà Nội", "0901234567"));
        studentsList.add(new Students(2, "Tran Thi B", 21, "CTK43", "b.tran@example.com", "TP HCM", "0902345678"));
        studentsList.add(new Students(3, "Le Van C", 19, "CTK44", "c.le@example.com", "Đà Nẵng", "0903456789"));
        studentsList.add(new Students(4, "Pham Thi D", 22, "CTK42", "d.pham@example.com", "Hải Phòng", "0904567890"));
        studentsList.add(new Students(5, "Hoang Van E", 20, "CTK44", "e.hoang@example.com", "Cần Thơ", "0905678901"));
        model.addAttribute("studentsList", studentsList);
        return "studentList";


    }


}
