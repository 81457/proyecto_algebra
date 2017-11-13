package figura;

import java.util.Scanner;


public class Rombo {
    private int a=9;
    public void rom(){
        Scanner obj=new Scanner(System.in);
        int x=2;
        while(x % 2 == 0)
        {
            System.out.println("ingrese numero de filas que tendra el rombo(solo impar) :");
            x=obj.nextInt();
        }
        a=x;
        for(int i=1; i<=((a/2)+1);i++){
            for(int k=1; k<= a/2-i+1; k++)
                System.out.printf(" ");
            for(int j =(a/2)-i+2; j<=(a/2)+i; j++)
                System.out.printf("*");
                System.out.printf("\n");
        }
        for(int l=1; l<=a/2; l++){
            for(int m=1; m<=l; m++)
            {
                System.out.print(" ");
            }
            for(int n=l+1; n<=a-l; n++)
                System.out.printf("*");
            System.out.println();
        }
    }
}
