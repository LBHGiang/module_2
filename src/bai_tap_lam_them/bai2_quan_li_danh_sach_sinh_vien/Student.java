package bai_tap_lam_them.bai2_quan_li_danh_sach_sinh_vien;

public class Student {
    private String code = "0";
    private String name = "";
    private String birthday;
    private boolean gender = true;
    private String className = "";

    //constructor

    public Student() {
    }

    public Student(String code, String name, String className) {
        this.code = code;
        this.name = name;
        this.className = className;
    }

    public Student(String code, String name, String birthday, boolean gender, String className) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.className = className;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        if (this.gender) {
            return "MALE";
        }
        return "FEMALE";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", gender=" + getGender() +
                ", className='" + className + '\'' +
                '}';
    }



}
