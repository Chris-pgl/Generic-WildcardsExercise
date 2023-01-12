import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Start {
    public static void main(String[] args) {

        List<Double> individualMarksListLisa = new ArrayList<>();
        Random random = new Random();
        individualMarksListLisa.add(random.nextDouble());
        individualMarksListLisa.add(random.nextDouble());


        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(random.nextInt());
        projectMarksListJeremy.add(random.nextInt());

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa","DiMarco",lisaAvg));
        listOfStudents.add(new Student("Jeremy","Longo",jeremyAvg));


        for(Student student : listOfStudents){
            System.out.println(student.toString());
        }


    }
}
