import controler.StudyGroupController;
import model.Student;
import model.StudyGroup;

import java.util.List;

public static void main(String[] args) {
    StudyGroupController controller = new StudyGroupController();

    List<Student> students = List.of(
            new Student(1, "Alice"),
            new Student(2, "Bob"),
            new Student(3, "Charlie")
    );
    StudyGroup studyGroup = controller.formStudyGroup(1, "Professor Smith", students);
    System.out.println(studyGroup);
}