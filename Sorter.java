public class Sorter {
    public static void main(String[] args) {
        
    }

    public void sort(int arr[]) {
        InsertionSort(arr);
    }

    public static void selectionsort(double[] list){
        for (int i = 0; i<list.length - 1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length;j++) {
                if (currentMin > list[i]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public void InsertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}

