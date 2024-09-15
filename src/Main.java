public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.createTeacher();
        teacherController.showTeacherList();
        teacherController.editTeacher();
        teacherController.showTeacherList();
    }
}