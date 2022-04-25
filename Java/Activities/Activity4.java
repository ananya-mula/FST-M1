package activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] arr = {5,9,1,4,8,19,2,3,56,98,6,90,};
        int[] sorted_arr;
        int temp = 0;

        System.out.println("The actual Array is : ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] +" ");

        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("The actual Array is : ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] +" ");



    }


}

