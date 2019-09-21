import java.util.Scanner;
public class Test04{
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int max;
        System.out.println("请输入第1个整数");
        max=sc.nextInt();
        for(int i=1;i<3;i++){
        	System.out.println("请输入第"+(i+1)+"个整数");
        	int a=sc.nextInt();
           if(max<a){
                    max=a;
            	}
            }
            System.out.println("max="+max);
        }
    }

        
