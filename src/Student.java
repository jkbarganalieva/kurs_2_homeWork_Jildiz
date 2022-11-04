public class Student extends Magistrant {
    private String group;
    
    public Student() {
        super();

    }
    public Student(String group, String fullName, int age, Grade grade, EducationalInstitution educationalInstitution) {
       
        super(fullName, age, grade, educationalInstitution);
        this.group = group;
        super.getFullName();
        super.getAge();
        super.getGrade();
        super.getEducationalInstitution();
    }
    public Student( String fullName, int age, Grade grade, EducationalInstitution educationalInstitution) {

        super(fullName, age, grade, educationalInstitution);

        super.getFullName();
        super.getAge();
        super.getGrade();
        super.getEducationalInstitution();
    }

       public Student(String group,String fullName) {
        super(fullName);
        this.group = group;
        super.getFullName();
    }
    public Student(String fullName) {
        super(fullName);
        super.getFullName();
    }

    public String getInfo() {
        return super.getInfo()+
                "\nGroup: "+(group==null?" ":group);
    }
}
