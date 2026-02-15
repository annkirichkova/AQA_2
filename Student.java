import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;

        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static void removePoorStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 5);
        grades1.put("Physics", 4);
        grades1.put("Programming", 5);
        students.add(new Student("Иван", "Группа 1", 2, grades1));

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("Physics", 2);
        grades2.put("Programming", 3);
        students.add(new Student("Петр", "Группа 1", 1, grades2));

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 4);
        grades3.put("Physics", 3);
        grades3.put("Programming", 4);
        students.add(new Student("Андрей", "Группа 2", 3, grades3));

        printStudents(students, 2);
    }
}