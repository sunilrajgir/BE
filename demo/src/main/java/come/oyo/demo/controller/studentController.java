package come.oyo.demo.controller;

import come.oyo.demo.student.Student;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
public class studentController {

    @RequestMapping("/getStudents")
   public List<Student> getStudents() {
       return List.of(
               new Student(1L,
                       "Sunil Kumar",
                            "sunilrajgir@gmail.com",
                       LocalDate.of(1992, 03, 06),
                       30
                            )
       );
   }
}
