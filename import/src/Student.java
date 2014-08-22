import com.someProgect.Course;

public class Student {

    public String name;
    public int age;
    public Course course;
    //public Course course = new Course();
    //comment

    public void sayHello(){
        System.out.println("Hi " + name);
        course.aboutCourse();
    }
}