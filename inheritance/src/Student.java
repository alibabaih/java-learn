public class Student extends Human {
    private static final String N_A = "N/A";

    private int course = 1;

    public Student(String name){
        super(name);    //reference on higher class
        System.out.println("I'm in student constructor");
    }

    public int getCourse(){
        return course;
    }

    public void setCourse(int course){
        this.course = course;
    }

}
