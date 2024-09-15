import java.util.List;

public class TeacherView {
    public void showTeacherList(List<Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("The list of teachers is empty.");
        } else {
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}