import java.util.List;
import java.util.Scanner;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        teacherService.createTeacher(name, subject);
        teacherView.showMessage("Teacher created successfully.");
    }

    public void editTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID of the teacher to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        System.out.print("Enter new teacher name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new subject: ");
        String newSubject = scanner.nextLine();
        teacherService.editTeacher(id, newName, newSubject);
        teacherView.showMessage("Teacher edited successfully.");
    }

    public void showTeacherList() {
        List<Teacher> teachers = teacherService.getTeacherList();
        teacherView.showTeacherList(teachers);
    }
}