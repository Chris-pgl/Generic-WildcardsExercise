import java.util.List;

public class Student {


        public String studentName;
        public String studentSurname;
        public double markAverage;


    public Student(String studentName, String studentSurname, double markAverage){
            this.studentName = studentName;
            this.studentSurname = studentSurname;
            this.markAverage = markAverage;
        }

        //preso online ------------------------------------------
    public static double getAverageMark(List<? extends Number> listOfMarks){
       double sum = listOfMarks.get(0).doubleValue() +
               listOfMarks.get(1).doubleValue();
       for (int i = 2; i < listOfMarks.size(); i++) {
           sum += listOfMarks.get(i).doubleValue();
        }
       return sum / listOfMarks.size();
    }
        //--------------------------------------------------------

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", markAverage=" + markAverage +
                '}';
    }










}