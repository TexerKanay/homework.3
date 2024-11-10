public class homework3 {
    public static void main(String[] args) {
        double[] numbers = {3.2, 1.5, -4.0, 2.1, 5.7, 3.3, -7.8, 4.4, 6.5, 5.5, 1.9, 6.6, -2.5, 7.1, 8.6};

        double sum = 0;
        int count = 0;
        boolean Negative = false;

        for (double elements : numbers) {
            if (elements < 0) {
                Negative = true;
            } else if (Negative) {
                sum += elements;
                count++;
            }
        }

        if (count > 0) {
            System.out.println(sum / count);
        }
    }
}


