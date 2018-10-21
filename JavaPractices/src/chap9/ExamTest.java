package chap9;

public class ExamTest {

    public ExamTest(String examName, int passingYear) {
        System.out.println("Exam Name: " + examName + "\nPassing year: " + passingYear);

    }

    public static void main(String[] args) {

        ExamTest exam = new ExamTest(" HSC ", 2008);

        int i;
        try {
            i = calculate();
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }

    static int calculate() {
        return (7 / 2);
    }

}
