package main.java.seminar.seminar5.dataModel;

public class Teacher extends User{
    int teacherId;

    public Teacher(int teacherId, String name, String surname, String patronymic) {
        super(name, surname, patronymic);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
