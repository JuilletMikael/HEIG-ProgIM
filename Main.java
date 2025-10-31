public class Main {

    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass();

        boolean shouldAddStudent = schoolClass.askAddStudent();

        while (shouldAddStudent) {
            schoolClass.addStudent();
            shouldAddStudent = schoolClass.askAddStudent();
        }

        schoolClass.showResume();
        schoolClass.askSearchStudent();
    }
}
