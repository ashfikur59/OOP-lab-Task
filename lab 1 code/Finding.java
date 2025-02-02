public class Finding {
    public static void main(String[] args) {

                int[] a = {5,7,8,11,17,40};
                int sum=0;


                for(int i=0;i<a.length;i++ )
                {
                    sum = sum + a[i];
                }
                System.out.println("Sum is = "+sum);

                double avg=sum/6.00;

                System.out.println("Avg is = "+avg);

                int evenCount = 0;
                int oddCount = 0;

                System.out.print("Even numbers: ");
                for (int num : a) {
                    sum += num;
                    if (num % 2 == 0) {
                        System.out.print(num + " ");
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }

                System.out.println();
                System.out.print("Odd numbers: ");
                for (int num : a) {
                    if (num % 2 != 0) {
                        System.out.print(num + " ");
                    }
                }

            }
        }

