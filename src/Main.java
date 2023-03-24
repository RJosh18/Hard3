public class Main {


    static int count1(int n)
    {
        int count = 0;
        for (int i = 1; i <= n; i++)
        {
            String[] digits = String.valueOf(i).split("");

            for (String digit : digits) {
                if (digit.equals("1")) {
                    count++;
                }
            }
        }
      return count;
    }

    public static void main(String[] args)
    {
        int n = 10;
        int count = count1(n);
        System.out.println("Total number of 1's appearing in in all non-negative integers less than or equal to n:" + count);
    }
}
