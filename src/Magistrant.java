public class Magistrant {

    private String fullName;
    private int age;
    private Grade grade;
    private EducationalInstitution educationalInstitution;

    public Magistrant(String fullName) {
        this.fullName = fullName;

    }

    public Magistrant(String fullName, Grade grade, EducationalInstitution educationalInstitution) {
        this.fullName = fullName;
        this.grade = grade;
        this.educationalInstitution = educationalInstitution;
    }

    public Magistrant(String fullName, int age, Grade grade, EducationalInstitution educationalInstitution) {
        this.fullName = fullName;
        this.age = age;
        this.grade = grade;
        this.educationalInstitution = educationalInstitution;
    }

    public Magistrant() {

    }
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    public EducationalInstitution getEducationalInstitution() {
        return educationalInstitution;
    }

    public String getInfo() {
        return "Full Name: " + (fullName == null ? " " : fullName) +
                "\nAge: " + (age == 0 ? " " : age) +
                "\nGrade: " + (grade == null ? " " : grade) +
                "\nEducationalInstitution name: " +
                (educationalInstitution == null ? " " : educationalInstitution.getName()) +
                "\nEducationalInstitution address: " +
                (educationalInstitution == null ? " " : educationalInstitution.getAddress());
    }


    public void dialTheСode() {
        System.out.println("Программирует на Java");
    }

    public void dialTheCode(String encodes) {
        System.out.println(encodes);
    }
}
