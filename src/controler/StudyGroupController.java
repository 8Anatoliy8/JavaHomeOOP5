package controler;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

import java.util.List;

public class StudyGroupController {
    private final StudyGroupService studyGroupService;

    public StudyGroupController() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup formStudyGroup(int teacherId, String teacherName, List<Student> students) {
        Teacher teacher = new Teacher(teacherId, teacherName);
        return studyGroupService.createStudyGroup(teacher, students);
    }

}
