public class Student extends Person {
    private Section[] sections = new Section[10];
    private int sectionCount;
    private int grade;

    public Student(String name, int id, int grade) {
        super(name, id);
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }
    public void addSection(Section s){
        sections[sectionCount]= s;
        sectionCount++;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
