import java.util.Arrays;
import java.util.Scanner;
class main{
    public static void main(String[] args){
        int array[] = {6,3,5,7,6,2,5,6,3,4};
        Scanner methodSorter = new Scanner(System.in);
        switch (methodSorter.nextInt()){
            case 1 :
                System.out.println(Arrays.toString(Sorting.bubble(array))); //пузырьком
                break;
            case 2 :
                System.out.println(Arrays.toString(Sorting.choice(array))); //выбором
                break;
            case 3 :
                System.out.println(Arrays.toString(Sorting.inserts(array))); //вставками
                break;
            default :
                System.out.println("такого метода сортировки нет");
                break;
        }
    }
}