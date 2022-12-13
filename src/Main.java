public class Main {
    public static void main(String[] args) {
        double numbers[] = {-2.5,1.1,3.4,-5.6,7.8,-8.9,1.2,-2.13,3.4,-4.3,5.4,-7.6,9.8,-9.8,7.6};
        double sum = 0;
        int amount = 0;
        boolean isNegative= false;
        for (double x: numbers) {
            if(x < 0){
                isNegative=true;
            } else if (x > 0 && isNegative) {
                sum = x;
                amount++;
                System.out.println(x);

            }
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/amount);

    }
}