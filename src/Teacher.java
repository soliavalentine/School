public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;
    public Teacher(String name, String subject, int id) {
        super(name, id);
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }
    public void addSection(Section s){
        sections[sectionCount]= s;
        sectionCount++;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
