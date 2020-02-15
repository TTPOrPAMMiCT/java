
public class Sorting {
    public static int[] bubble(int[] arrayA){
        boolean check = true;
        int buf;
        while (check){
            check = false;
            for (int i = 0; i < arrayA.length -1; i++){
                if (arrayA[i] > arrayA[i + 1]){
                    buf = arrayA[i];
                    arrayA[i] = arrayA[i + 1];
                    arrayA[i + 1] = buf;
                }
            }
        }
        return arrayA;
    }
    public static int[] choice(int[] arrayB ){
        for (int i = 0; i < arrayB.length; i++) {
            int min = arrayB[i];
            int minId = i;
            for (int j = i+1; j < arrayB.length; j++) {
                if (arrayB[j] < min) {
                    min = arrayB[j];
                    minId = j;
                }
            }
            int temp = arrayB[i];
            arrayB[i] = min;
            arrayB[minId] = temp;
        }
        return arrayB;
    }
    public static int[] inserts(int[] arrayC) {
        for (int k = 1; k < arrayC.length; k++) {
            int newElement = arrayC[k];
            int location = k - 1;
            while (location >= 0 && arrayC[location] > newElement) {
                arrayC[location + 1] = arrayC[location];
                location--;
            }
            arrayC[location + 1] = newElement;
        }
        return arrayC;
    }
}
