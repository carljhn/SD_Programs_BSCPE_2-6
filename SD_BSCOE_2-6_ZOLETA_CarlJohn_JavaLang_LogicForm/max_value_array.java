// Finding the maximum value in an array

public class max_value_array {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 81};
        int maxValue = numbers[0];

        // Implementing for loop to find the largest number in the given array
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }

        System.out.println("=============================================");
        System.out.println("The maximum value in the array is: " + maxValue);
        System.out.println("=============================================");
    }
}