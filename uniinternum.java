import java.util.Scanner;
public class uniinternum
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  r,f,ctwo,cthr,t = s.nextInt();
        long b;
        String a ;
        while(t>0)
        {
            a = s.next();
            b=Long.parseLong(a);
            ctwo = 0 ; cthr =0;f=0;
            if(b%9==0)
            {
                f++;
            }
            else
            {
                r=9-(int)(b%9);
                
                    for(int i=0;i<a.length();i++)
                    {
                        if(a.charAt(i)=='2')
                        {
                            ctwo++;
                        }
                        if(a.charAt(i)=='3')
                        {
                            cthr++;
                        }
                    }
                    if((ctwo+cthr)<a.length()&&(cthr!=a.length()))
                    {
                        switch(r)
                        {
                            case 1:
                                if(ctwo>=5||(ctwo>=2&&cthr>=1))
                                {
                                    f++;
                                }
                                break;
                            case 2:
                                if(ctwo>=1)
                                {
                                    f++;
                                }
                                break;
                            case 3:
                                if((ctwo>=3&&cthr>=1)||cthr>=2||(ctwo>=6))
                                {
                                    f++;
                                }
                                break;
                            case 4:
                                if(ctwo>=2)
                                {
                                    f++;
                                }
                                break;
                            case 5:
                                if(ctwo>=7||(cthr>=1&&ctwo>=4)||(cthr>=2&&ctwo>=1))
                                {
                                    f++;
                                }
                                break;
                            case 6:
                                if(ctwo>=3||cthr>=1)
                                {
                                    f++;
                                }
                                break;
                            case 7:
                                if(ctwo>=8||cthr>=3||(cthr==2&&ctwo==2)||(cthr==1&&ctwo==5))
                                {
                                    f++;
                                }
                                break;
                            case 8:
                                if(ctwo>=4||(cthr>=1&&ctwo>=1))
                                {
                                    f++;
                                }
                            default:
                        }
                        }
                
            }
            if(f==0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
            t--;
        }   
    }
}