public class BubbleSort {
    public static void main(String[] args) {
        int[] values = {4, 6, 3, 7, 8, 1, 2, 9, 10, 5};

        values = bubbleSort(values);

        for(int i = 0; i < 10; i++){
            System.out.printf("%d ", values[i]);
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] values) {
        int valuesLen = values.length;

        for(int i = 0; i < valuesLen - 1; i++){
            for(int j = 0; j < valuesLen - 1; j++){
                if(values[j] > values[j+1]){
                    int tmp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = tmp;
                }
            }
        }

        return values;
    }
}