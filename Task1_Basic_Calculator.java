import java.util.Scanner;
class Task1_Basic_Calculator
{
    public void addNum(double  num1,double num2)
    {
        System.out.println("Addition of: "+num1+" and "+num2+" is = "+(num1+num2));
    }
    public void subNum(double num1,double num2)
    {
        System.out.println("Substraction of: "+num1+" and "+num2+" is = "+(num1-num2));
    }
    void mulNum(double num1,double num2)
    {
        System.out.println("Multiplication of: "+num1+" and "+num2+" is = "+(num1*num2));
    }
    void divNum(double num1,double num2)
    {
        try {
                    System.out.println("Division of: "+num1+" and "+num2+"is = "+(num1/num2));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number with 0 \n try another number");
        }

    }
    void modNum(double num1,double num2)
    {
        System.out.println("Mod of: "+num1+" and "+num2+" is = "+(num1%num2));
    }
    public static void main(String[] args) {
     double num1,num2;
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for Calculation:");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        
        Task1_Basic_Calculator tsk1=new Task1_Basic_Calculator();

        do{
        System.out.println("________________________________________");
        System.out.println("Select Operator/operation to prform on "+num1+" and "+num2);
        System.out.println("1.Additioin(+)");
        System.out.println("2.Substraction(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.Division(/)");
        System.out.println("5.Modulus(%)");
        System.out.println("6.Exit");
        choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    tsk1.addNum(num1,num2);
                    break;
                case 2:
                    tsk1.subNum(num1,num2);
                    break;
                case 3:
                    tsk1.mulNum(num1,num2);
                    break;
                case 4:
                    tsk1.divNum(num1,num2);
                    break;
                case 5:
                    tsk1.modNum(num1,num2);
                    break;
                case 6:
                    System.out.println("closing operation \nEND:)");
                    break;
                default:
                    System.err.println("Enter valid input as per given instruction and try again!");
            }
        }while(choice !=6);
        


    }
}