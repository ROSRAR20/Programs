import java.util.Scanner;
public class notett
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your amount");
        int s = n.nextInt();
        int c=0;
        if(s>=2000)
        {
            c+=s/2000;
            s%=2000;
        }
         if(s>=500)
        {
            c+=s/500;
            s%=500;
        }
         if(s>=200)
        {
            c+=s/200;
            s%=200;
        }
         if(s>=100)
        {
            c+=s/100;
            s%=100;
        }
        if(s>=50)
        {
            c+=s/50;
            s%=50;
        }
        if(s>=20)
        {
            c+=s/20;
            s%=20;
        }
        if(s>=10)
        {
            c+=s/10;
            s%=10;
        }
        if(s>=5)
        {
            c+=s/5;
            s%=5;
        }
        if(s>=0)
        {
            c+=s;
        }
        System.out.println("Number of notes are "+c);
    }
}