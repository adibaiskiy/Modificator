package practice;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(2L, "Adilet", "Zhumabekov",
                        LocalDate.of(2005,8,11),"M", 500616115),
                new Student(3L, "Baha", "Abdykerimov", LocalDate.of
                        (1987,4,2),"M",994995992)
        };
        Group group = new Group(1L, "Java 15", students);
        //add Student
        group.addStudent(new Student(4L,"Baisal", "Kerimov",  LocalDate.of
                (1985,2,22),"M",994993492));

        System.out.println();
//        System.out.println(group.StudentFindById(2L));

//        group.deleteStudentId(4L);
        //update
        group.updateStudent(3L,new Student(5L, "Atay", "Narynbekov", LocalDate.of(2003,2,4), "M", 500432522));

        group.getAllStudents();
    }


}
