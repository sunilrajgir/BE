package come.oyo.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
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
