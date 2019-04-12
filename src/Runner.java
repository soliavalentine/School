public class Runner {
    public static void main(String[] args) {
        Teacher a = new Teacher("Albinson", "compsci",1);
        Teacher b = new Teacher("Teacher2", "biology", 2);
        Teacher c = new Teacher("Teacher3", "math", 3);
        School BHS = new School("BHS");
        Student d = new Student("me", 4,11);
        Student e = new Student("Student2", 5,11);
        Student f = new Student("Student3", 6,11);
        Student g = new Student("Student4", 7,11);
        Student h = new Student("Student5", 8,11);
        Student i = new Student("Student6", 9,11);
    Section math = new Section(b,"math");
    Section bio = new Section(c,"biology");
    Section compsci = new Section(a, "compsci");
    bio.addStudent(e);
    math.addStudent(f);
    math.addStudent(d);
    compsci.addStudent(g);
    compsci.addStudent(h);
    compsci.addStudent(i);
    System.out.println(math.toString());
    System.out.println(bio.toString());
    System.out.println(compsci.toString());


    }
}
