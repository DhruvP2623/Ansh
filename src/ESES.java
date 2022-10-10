public class ESES
{
    static int total;

    static int rollNUmber;
    static double percentage;
    public static void studentmarksheet(String name, int rollNumber, int maths, int sci, int eng) {

        total =maths +sci +eng;
        percentage =total/3;

        System.out.println(name + " rollNumber = " + rollNumber + " Toatl marks = " + total + " & percentage = " + percentage + "%");

        if(maths>=35 && sci>=35 && eng>35)
        {
            System.out.println("Pass");
            System.out.println("Congratulation");
        }
        else {
            System.out.println("Fail");

        }

    }
    public static void main(String[] args) {
        studentmarksheet("Sagar", 1, 57, 34, 90);


    }
}
