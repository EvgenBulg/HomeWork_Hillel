import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentService {

    public static void listOfStudentsFaculty (String faculty){
        for (int i = 0; i < StudentRun.student.length; i++) {
            if(StudentRun.student[i].getFaculty().equalsIgnoreCase(faculty)){
                System.out.println(StudentRun.student[i]);
            }
        }
    }

    public static void listOfStudentsFacultyAndCourse (String faculty, int course){
        for (int i = 0; i < StudentRun.student.length; i++) {
            if(StudentRun.student[i].getFaculty().equalsIgnoreCase(faculty) && StudentRun.student[i].getCourse() == course){
                System.out.println(StudentRun.student[i]);
            }
        }
    }

    public static void listOfStudentsBornAfterYear(String date) throws ParseException {
        String d1 = date;
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date first_date = sdf.parse(d1);
        Date second_date = null;

        for (int i = 0; i < StudentRun.student.length; i++) {
            String d2 = StudentRun.student[i].getYearOfBirthday();
            second_date = sdf.parse(d2);

            if(first_date.before(second_date)){
                System.out.println(StudentRun.student[i]);
            }
        }
    }

    public static void studyGroupList(String group){
        for (int i = 0; i < StudentRun.student.length; i++) {
            if(StudentRun.student[i].getGroup().equalsIgnoreCase(group)){
                System.out.println(StudentRun.student[i]);
            }
        }
    }





}
