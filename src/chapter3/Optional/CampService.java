package chapter3.Optional;

import java.util.Optional;

public class CampService {

    //속성
    String name;

    Student[] students =
            {new Student("Sparten"),
            new Student("Steve"),
            new Student("John")};

    //기능
    //student 객체를 찾아줌
    public Optional<Student> findStudentName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.ofNullable(student);
            }
        }
        //return Optional.ofNullable(null);
        return Optional.empty();
    }

}
