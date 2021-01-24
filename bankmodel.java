import java.util.Scanner;
class Operation{
    void withdrawl(int bal,int x){
        if(x>0 && x%100==0){
            if(x<2000){
                bal=bal-x;
                System.out.println("withdrawl amount"+x);
                System.out.println("remaining amount"+bal);
            }
        }
    }
    void deposit(int bal,int y){
        if(y>0 && y%100==0){
            bal=bal+y;
            System.out.println("withdrawl amount"+y);
            System.out.println("remaining amount"+bal);
        }
    }
}
public class BankModel{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int bal=2000;
        int count=0;
        while(true){
        int password=s.nextInt();
        if(password==1111 || password==2222||password==3333){
            System.out.println("1.Withdrawl\n2.Deposit");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                    int x=s.nextInt();
                    Operation op=new Operation();
                    op.withdrawl(bal,x);
                case 2:
                    int y=s.nextInt();
                    Operation op1=new Operation();
                    op1.deposit(bal,y);
            }
        }
        else{
            count++;
            System.out.println("Wrong PASSWORD");
            if(count==3){
                System.out.println("Transaction temporarily cancelled");
            }
        }
        }
    }
}
