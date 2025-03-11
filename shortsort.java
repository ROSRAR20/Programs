import java.util.Scanner;

public class shortsort
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int s= n.nextInt();
        String[] a= new String[1000];
        for(int i=0;i<s;i++)
        {
            a[i]=n.nextLine();
        }
        System.out.println("A:");
        for(int i=0;i<s;i++)
        {
            System.out.println(a[i]);
        }
    }
}/*
abc
acb
bac
bca
cab
cba*/