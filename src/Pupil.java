public final class Pupil extends Student {

    private String form;

    public String getForm() {
        return form;
    }

    public Pupil() {
        super();

    }
    public Pupil(String form, String fullName, int age, Grade grade,
                 EducationalInstitution educationalInstitution) {

        super(fullName, age, grade, educationalInstitution);
        this.form = form;
        super.getFullName();
        super.getAge();
        super.getGrade();
        super.getEducationalInstitution();
    }

    public Pupil(String form,String fullName) {
        super(fullName);
        this.form = form;
        super.getFullName();
    }
    public String getInfo() {
        return super.getInfo()+
                "\n Form: "+(form==null? " ":form);
    }
}
