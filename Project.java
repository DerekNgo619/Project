public class Project
{
    public static void main(String[] args) 
    {
        int i = 0;
        int k = 0;
        int a = 0;
        int b = 0;
        do {
            System.out.println("i is " + i + " but is less than 15");
            i++;
            } while (i < 15);
        do {
            System.out.println("k is " + k + " but is greater than 5");
            k++;
        }    while (k > 5);
        do {
            System.out.println("a is " + a + " but is less than 10");
            System.out.println("b is " + b + " but is less than or equal to 20");
            a++;
            b++;
            } while (a < 10 && b <= 20);
        }
    }
