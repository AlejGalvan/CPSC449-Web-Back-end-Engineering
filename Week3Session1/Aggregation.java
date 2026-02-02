import java.util.List;
import java.util.ArrayList;

// Student class
class Student {

    // Attributes of Student
    private String studentName;
    private int studentId;

    // Constructor of Student class
    public Student(String studentName, int studentId)
    {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public int getstudentId() { 
      return studentId; 
    }

    public String getstudentName() {
      return studentName; 
    }
}

// Department class 
// Department class contains list of Students
class Department {

    // Attributes of Department class
    private String deptName;
    private List<Student> students;

    // Constructor of Department class
    public Department(String deptName, List<Student> students)
    {
        this.deptName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
      return students; 
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
}


// Institute class
// Institute class contains the list of Departments
class Institute {

    // Attributes of Institute
    private String instituteName;
    private List<Department> departments;

    // Constructor of Institute class
    public Institute(String instituteName,
                     List<Department> departments)
    {
        // This keyword refers to current instance itself
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    // Method of Institute class
    // Counting total students in the institute
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students = null;

        for (Department dept : departments) {
            students = dept.getStudents();

            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        Student s3 = new Student("Charlie", 103);
        Student s4 = new Student("David", 104);

        // Create list of students for CSE Department
        List<Student> cseStudents = new ArrayList<>();
        cseStudents.add(s1);
        cseStudents.add(s2);

        // Create CSE Department
        Department csDepartment = new Department("Computer Science", cseStudents);


        // Create list of students for Electricals Department
        List<Student> eceStudents = new ArrayList<>();
        eceStudents.add(s3);
        eceStudents.add(s4);

        // Create Electricals Department
        Department eDepartment = new Department("Electricals", eceStudents);

        // Create list of departments for Institute
        List<Department> departments = new ArrayList<>();
        departments.add(csDepartment);
        departments.add(eDepartment);

        // Create Institute
        Institute institute = new Institute("Tech Institute", departments);

        // Getting total number of students in the institute
        
    }
}
