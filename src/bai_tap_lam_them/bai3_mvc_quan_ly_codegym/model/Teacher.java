package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model;

public class Teacher extends Person {
    private int speciality;

    public Teacher() {
    }

    public Teacher(int speciality) {
        this.speciality = speciality;
    }

    public Teacher(int id, String name, int speciality) {
        super(id, name);
        this.speciality = speciality;
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, int speciality) {
        super(id, name, dateOfBirth, gender);
        this.speciality = speciality;
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "speciality=" + speciality +
                '}';
    }
}
