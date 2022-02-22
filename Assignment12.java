import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    int id, age, yearOfEnrollment;
    String name, gender, department;
    double perTillDate;

    List<Student> students;

    public Student() {

    }

    public Student(int id, String name, int age, String gender, String department, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public void addStudents() {
        students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }

    public void printAllDepartments() {
        Set<String> departments = students.stream().map(s -> s.department).collect(Collectors.toSet());
        System.out.println("Departments are: "+departments);
    }

    public void printStudentNamesEnrolledAfter2018() {
        List<String> names = students.stream().filter(s -> s.yearOfEnrollment > 2018).map(s -> s.name).collect(Collectors.toList());
        System.out.println("Students enrolled after 2018 are: "+names);
    }

    public void printMaleStudentsInCompScience() {
        List<Student> compSciMaleStudents = students.stream().filter(s -> s.gender == "Male" && s.department == "Computer Science").collect(Collectors.toList());
        System.out.println("Male students that enrolled after 2018: ");
        for(Student s : compSciMaleStudents) {
            System.out.println(s.toString());
        }
    }

    public void countStudentsByGender() {
        Map<String, Long> studentCount = students.stream().collect(Collectors.groupingBy(s -> s.gender, Collectors.counting()));

        System.out.println("Number of male students: "+studentCount.get("Male"));
        System.out.println("Number of female students: "+studentCount.get("Female"));
    }

    public void averageMaleAndFemaleAge() {
        Double averageMaleAge = students.stream().filter(s -> s.gender == "Male").collect(Collectors.averagingInt(s -> s.age));
        System.out.println("Average male age is: "+averageMaleAge);

        Double averageFemaleAge = students.stream().filter(s -> s.gender == "Female").collect(Collectors.averagingInt(s -> s.age));
        System.out.println("Average male age is: "+averageFemaleAge);
    }

    public void studentWithHighestPercentage() {
        Optional<Student> student = students.stream().max(Comparator.comparingDouble(s -> s.perTillDate));

        System.out.println("Student with highest percentage: "+student.get());
    }

    public void countStudentsInDepartments() {
        Map<String, Long> studentCount = students.stream().collect(Collectors.groupingBy(s -> s.department, Collectors.counting()));

        System.out.println("Students in each department are: "+studentCount);
    }

    public void averageInEachDepartment() {
        Map<String, Double> averages = students.stream().collect(Collectors.groupingBy(s -> s.department, Collectors.averagingDouble(s -> s.perTillDate)));
        System.out.println("Averages per department: "+averages);
    }

    public void youngestStudentInElectronicsDepartment() {
        Optional<Student> youngest = students.stream().filter(s -> s.department == "Electronic" && s.gender == "Male")
                        .collect(Collectors
                        .minBy(Comparator.comparingInt(s -> s.age)));

        System.out.println("Youngest student in Electronics Department is: "+youngest.get());
    }

    public void countStudentsInCSEByGender() {
        Map<String, Long> studentsInCSE = students.stream().filter(s -> s.department == "Computer Science").collect(Collectors.groupingBy(s -> s.gender, Collectors.counting()));
        System.out.println("Students in CSE based on gender: "+studentsInCSE);
    }

    public String toString() {
        String formatted = String.format("Student [id] = %d, [name] = %s, [age] = %d, [gender] = %s, [department] = %s, [year of enrollment] = %d, [perTillDate] = %f", id, name, age, gender, department, yearOfEnrollment, perTillDate);

        return formatted;
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        Student student = new Student();

        student.addStudents();

        student.printAllDepartments();
        System.out.println();

        student.printStudentNamesEnrolledAfter2018();
        System.out.println();

        student.printMaleStudentsInCompScience();
        System.out.println();

        student.countStudentsByGender();
        System.out.println();

        student.averageMaleAndFemaleAge();
        System.out.println();

        student.studentWithHighestPercentage();
        System.out.println();

        student.countStudentsInDepartments();
        System.out.println();

        student.averageInEachDepartment();
        System.out.println();

        student.youngestStudentInElectronicsDepartment();
        System.out.println();

        student.countStudentsInCSEByGender();
        System.out.println();
    }
}
