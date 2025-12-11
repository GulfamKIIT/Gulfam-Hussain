public class evenodd {
    public static void main(String[] args) {

        if (args.length != 10) {
            System.out.println("enter the 10 numbers");
            return;
        }

        int counteven = 0;
        int countodd = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                counteven++;
            } else {
                countodd++;

            }
        }
        System.out.println(counteven);
    }
}






