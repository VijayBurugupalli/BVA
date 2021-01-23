import java.util.Scanner;
class Addition{
    int add(int x,int y){
        return x+y;
    }
}
class Subtraction{
    int sub(int x,int y){
        return x-y;
    }
}
class Multiplication{
    int mul(int x,int y){
        return x*y;
    }
}
class Division{
    int div(int x,int y){
        return x/y;
    }
}
public class DMainClass{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value 1:");
        int a=s.nextInt();
        System.out.println("Enter the value 2:");
        int b=s.nextInt();
        while(true){
            System.out.println("Enter the choice:");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                    Addition ad=new Addition();
                    System.out.println("addition"+ad.add(a,b));
                    break;
                case 2:
                    Subtraction su=new Subtraction();
                    System.out.println("subtraction"+su.sub(a,b));
                    break;
                case 3:
                    Multiplication mu=new Multiplication();
                    System.out.println("multiplication"+mu.mul(a,b));
                    break;
                case 4:
                    Division di=new Division();
                    System.out.println("division"+di.div(a,b));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:System.out.println("INVALID CHOICE");
            }
        }
    }
}
