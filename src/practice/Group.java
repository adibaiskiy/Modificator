package practice;

import java.util.Arrays;

public class Group {
    private long id;
    private String groupName;
    private Student[] students;

    public Group() {
    }

    public Group(long id, String groupName, Student[] students) {
        this.id = id;
        this.groupName = groupName;
        this.students = students;
    }
    public void addStudent(Student student){
       int newSize = students.length + 1;
       students = Arrays.copyOf(students,newSize);
       students[newSize - 1] = student;

    }
    public void getAllStudents() {
        for (Student student: students){
            System.out.println(student);
        }
    }
    public Student StudentFindById(Long studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }
    public void deleteStudentId(Long studentId) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == studentId){
                students[i] = students[students.length - 1];
                students = Arrays.copyOf(students,students.length - 1);
                break;
            }
        }
    }
    public void updateStudent(Long studentId, Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == studentId) {
                students[i] = newStudent;
                break;
            }
        }
    }





}
