public class Main {
    public static void main(String[] args) {

        Student student = new Student("Lavanya", "S212", "A+");
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Lavanya");
        controller.setStudentGrade("S");

        controller.updateView();
    }
}
