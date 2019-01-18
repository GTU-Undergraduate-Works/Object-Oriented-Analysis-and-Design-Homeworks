package duraklefkan.gtu.cse443.hw3.question2;

public class Main {


    public static void main(String[] args) {

        EmailComponent gtuEngPeople = new GroupEmail("cengpeople@gtu.edu.tr", "GTU Computer Engineering People Emails");
        EmailComponent gtuEngStudents = new GroupEmail("cengstudents@gtu.edu.tr", "GTU Computer Engineering Students Emails");
        EmailComponent gtuEngProfs = new GroupEmail("cengprofessors@gtu.edu.tr", "GTU Computer Engineering Professors Emails");

        gtuEngPeople.addEmail(gtuEngProfs);
        gtuEngPeople.addEmail(gtuEngStudents);


        gtuEngProfs.addEmail(new PersonalEmail("eaptoula@gtu.edu.tr", "Erchan Aptoula"));
        gtuEngProfs.addEmail(new PersonalEmail("akgul@gtu.edu.tr", "Yusuf Sinan Akgul"));
        gtuEngProfs.addEmail(new PersonalEmail("e.zerger@gtu.edu.tr", "Erkan Zergeroglu"));
        gtuEngProfs.addEmail(new PersonalEmail("hcelebi@gtu.edu.tr", "Hasari Celebi"));
        gtuEngProfs.addEmail(new PersonalEmail("gokturk@gtu.edu.tr", "Mehmet Gokturk"));
        gtuEngProfs.addEmail(new PersonalEmail("sevilgen@gtu.edu.tr", "Fatih Erdogan Sevilgen"));
        gtuEngProfs.addEmail(new PersonalEmail("abayrakci@gtu.edu.tr", "Alp Arslan Bayrakci"));
        gtuEngProfs.addEmail(new PersonalEmail("yakup.genc@gtu.edu.tr", "Yakup Genc"));

        gtuEngStudents.addEmail(new PersonalEmail("efkandurakli@gtu.edu.tr", "Efkan Durakli"));
        gtuEngStudents.addEmail(new PersonalEmail("r.demirci@gtu.edu.tr", "Rıdvan Demirci"));
        gtuEngStudents.addEmail(new PersonalEmail("e.duman@gtu.edu.tr", "Erdem Duman"));
        gtuEngStudents.addEmail(new PersonalEmail("s.mehder@gtu.edu.tr", "Şevval Mehder"));
        gtuEngStudents.addEmail(new PersonalEmail("m.onder@gtu.edu.tr", "Mehmet Önder"));
        gtuEngStudents.addEmail(new PersonalEmail("u.ates@gtu.edu.tr", "Uğurkan Ateş"));
        gtuEngStudents.addEmail(new PersonalEmail("c.toprak@gtu.edu.tr", "Cengiz Toprak"));
        gtuEngStudents.addEmail(new PersonalEmail("e.korkmaz@gtu.edu.tr", "Emire Korkmaz"));


        gtuEngPeople.print();



    }



}
