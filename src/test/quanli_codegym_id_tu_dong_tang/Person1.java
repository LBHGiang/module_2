package test.quanli_codegym_id_tu_dong_tang;

public class Person1 {
    /**
     * Thêm biến count dùng chung.
     * Trong phần tạo đối tượng dùng constructor không có id ++count và this.id=count
     * Trong phần đọc file dùng constructor có id.
     * Khi ghi ra file cần ghi thêm count ra file khác để lưu lại id cuối cùng.
     */
    private static int count;
    private int id;
    private String name;
    private String dateOfBirth;
    private String gender;

    public Person1() {
    }

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person1(String name, String dateOfBirth, String gender) {
        ++count;
        this.id = count;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Person1(int id, String name, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'';
    }


    public String toStringOfFile() {
        return String.format("%s,%s,%s,%s", id, name, dateOfBirth, gender);
    }
}
