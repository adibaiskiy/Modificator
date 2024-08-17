package practice;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String lastName;
    private String firsName;
    private LocalDate age;
    private String gender;
    private int phoneNumber;

    public Student() {
    }

    public Student(long id, String lastName, String firsName, LocalDate age, String gender, int phoneNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firsName = firsName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student -------" +
                "id: " + id + '\n' +
                "lastName: " + lastName + '\n' +
                "firsName: " + firsName + '\n' +
                "age: " + age + '\n' +
                "gender: " + gender + '\n' +
                "phoneNumber: " + phoneNumber;
    }
}
