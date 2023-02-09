public class Sorter {
    public static void main(String[] args) {
        
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
}
