import java.util.ArrayList;
import java.util.Scanner;
public class d2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> array = new ArrayList<>();

            System.out.println("Enter rows of the 2D array. Enter an empty line to finish input.");

            while (true) {
            
                String line = scanner.nextLine();

                // If the user presses Enter without input, stop taking rows
                if (line.isEmpty()) {
                    break;
                }

                // Split the input line and convert it to integers
                String[] tokens = line.split(" ");
                ArrayList<Integer> row = new ArrayList<>();
                for (String token : tokens) {
                    row.add(Integer.parseInt(token));
                }
                array.add(row);
            }

            scanner.close();

            // Display the 2D array
            /*System.out.println("\nThe 2D array is:");
            for (ArrayList<Integer> row : array) {
                System.out.println(row);
            }*/
        int safe =0;
        for (int i = 0; i < array.size(); i++)
        {
            int z=0;
            int c=0;
            if(array.get(i).get(0)>array.get(i).get(1))
            {
                for(int j=1;j<array.get(i).size();j++)
                {
                    if(array.get(i).get(j-1)>array.get(i).get(j))
                    {
                        int d=array.get(i).get(j-1)-array.get(i).get(j);
                        if(!(d>0&&d<=3))
                        {
                            c++;
                        }
                    }
                    else
                    if(array.get(i).get(j-2)>array.get(i).get(j)&&z==0)
                    {
                        int d=array.get(i).get(j-2)-array.get(i).get(j);
                        if(!(d>=1&&d<=3))
                        {
                            c++;
                            //break;
                        }
                        else{z++;}
                    }
                    else
                    {
                        c++;
                    }
                }
            }
            else
            if(array.get(i).get(0)<array.get(i).get(1))
            {
                for(int j=1;j<array.get(i).size();j++)
                {
                    if(array.get(i).get(j-1)<array.get(i).get(j))
                    {
                        int d=array.get(i).get(j-1)-array.get(i).get(j);
                        if(!(d<=-1&&d>=-3))
                        {
                            c++;
                            //System.out.print(c);
                        }
                    }
                    else
                    if(array.get(i).get(j-2)<array.get(i).get(j)&&z==0)
                    {
                        int d=array.get(i).get(j-2)-array.get(i).get(j);
                        if(!(d<=-1&&d>=-3))
                        {
                            c++;
                            //break;
                        }
                        else{z++;}
                    }
                    else
                    {
                        c++;
                    }
                    //System.out.println();
                }
            }
            else
            {
                c++;
            }
            if(c==0&&(z==1||z==0))
            {
                safe++;
            }
            //System.out.println(c);
        }
        System.out.println(safe);
    }
}
