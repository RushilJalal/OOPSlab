import java.util.*;
class IMath
{
    static int min(int x, int y)
    {
        return (x<y?x:y);
    }

    static int max(int x, int y)
    {
        return (x>y?x:y);
    }

    static int pow(int a, int n)
    {
        int ans=1;
        for(int i = 1; i<=n; i++)
        {
            ans*=a;
        }
        return ans;
    }

    static String decimalToBinary(int num)
    {
        String str="";
        int n = num;
        while(n>0)
        {
            int rem = n % 2;
            str = rem+str;  
            n /= 2;
        }
        return str;
    } 
    
    static int binaryToDecimal(int bin)
    {
        int i = 0, sum = 0;
        while(bin > 0)
        {
            int rem = bin % 10;
            sum += rem*pow(2,i);
            bin /= 10;
            i++;
        }
        return sum;
    }

    static String decimalToHex(int num)
    {
        String str="";
        int i = 0;
        String hex[] = {"A", "B", "C", "D", "E", "F"};
        while(num>0)
        {
            int rem = num % 16;
            if(rem <= 9)
                str = rem+str;
            else
            {
                str = hex[rem - 10] + str;
            }
            num /= 16;
        }
        return str;
    }
}

class math
{
    public static void main(String[] args) {
        System.out.println(IMath.decimalToBinary(8));
        System.out.println(IMath.binaryToDecimal(1101));
        System.out.println(IMath.decimalToHex(110));
    }
}
