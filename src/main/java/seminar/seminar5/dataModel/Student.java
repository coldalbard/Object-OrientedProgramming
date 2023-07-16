package main.java.seminar.seminar5.dataModel;

public class Student extends User{
    int studentId;
    public Student(int id, String name, String surname, String patronymic) {
        super(name, surname, patronymic);
        this.studentId = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
