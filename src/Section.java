public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;
    public Section(Teacher teacher, String name){
        this.teacher=teacher;
        this.name=name;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return students;
    }
    public void addStudent(Student s){
        students[currentSize]= s;
        currentSize++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public String toString(){
        String n = "";
        for(int i = 0; i<students.length;i++){
            if(students[i]!=null) {
                n = n + " " + students[i].getName();
            }
        }
       String x = "This " + name + " class is taught by " + teacher.getName() + " and has " + currentSize
     + " students:" + n;
       return x;
   }
}
