public class Main {
    public static void main(String[] args) {

        EducationalInstitution educationalInstitution = new EducationalInstitution("Geek Teck", "Ибраимова 103");
        Student student = new Student();
        System.out.println(student.getInfo());
        System.out.println("-------------------");
        Student student1 = new Student("A51", "Барганалиева Жылдыз Калыбековна",
                37, Grade.FIVE, educationalInstitution);
        System.out.println(student1.getInfo());
        student.dialTheСode();
        student.dialTheCode("Программирует на Python");
        System.out.println("-------------------");
        Student student2 = new Student("A 51", " Нурболов Эрбол");
        System.out.println(student2.getInfo());
        student.dialTheСode();
        student.dialTheCode("Программирует на Python");
        student.dialTheCode("Программирует на JS");
        System.out.println("_____________________");

        EducationalInstitution educationalInstitution1 = new EducationalInstitution(" 5 Гимназия", "Токтогула 15");
        Pupil pupil = new Pupil("8 A КЛАСС", "Эрланов Нурбек",
                13, Grade.FOUR, educationalInstitution1);
        System.out.println(pupil.getInfo());
        pupil.dialTheCode(" Учится программирует на Python");
        System.out.println("-------------------");
        Pupil pupil2 = new Pupil ("8 Б", " Алиева Мадина");
        System.out.println(pupil2.getInfo());
        pupil2.dialTheCode("Учится программировать на JS");

    }
}