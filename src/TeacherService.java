import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();
    private int nextId = 1;

    public Teacher createTeacher(String name, String subject) {
        Teacher newTeacher = new Teacher(nextId++, name, subject);
        teachers.add(newTeacher);
        return newTeacher;
    }

    public void editTeacher(int id, String newName, String newSubject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setName(newName);
                teacher.setSubject(newSubject);
                break;
            }
        }
    }

    public List<Teacher> getTeacherList() {
        return teachers;
    }
}