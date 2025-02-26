package chapter3.Optional;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CampService campService = new CampService();

        System.out.print("찾으시는 학생을 입력하세요: ");
        String name = scanner.nextLine();

        Optional<Student> optionalStudent = campService.findStudentName(name);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            System.out.println("학생 " + student.getName() + "이 있습니다.");
        } else {
            System.out.println("학생이 없습니다.");
        }


    }
}
