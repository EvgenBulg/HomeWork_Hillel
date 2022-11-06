public class Student {
    private static int idCounter;
    private int id;
    private String lastname;
    private String name;
    private String fatherName;
    private String yearOfBirthday;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student(){
        //констуктор по умолчанию, т.к по условию задачи должно быть объявлено несколько конструкторов.
    }

    public Student(String lastname, String name, String fatherName, String yearOfBirthday, String address, String phone, String faculty, int course, String group) {
        this.id = idCounter++;
        this.lastname = lastname;
        this.name = name;
        this.fatherName = fatherName;
        this.yearOfBirthday = yearOfBirthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return id + ". " + lastname + " " + name + " " + fatherName + "; дата рождения: " + yearOfBirthday + "; адрес: " + address +
                "; телефон: " + phone + "; факультет: " + faculty + "; курс:" + course + "; группа: " + group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(String yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
