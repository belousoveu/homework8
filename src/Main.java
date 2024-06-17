import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //task1
        // инициализация массива с использованием new и последующее заполнение отдельно каждого
        // элемента массива
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        // инициализация массива с одновременным присваиванием значений
        double[] doubleArray = {1.57, 7.654, 9.986};
        // инициализация массива с последующим заполением в элементов в цикле
        String[] stringArray = new String[4];
        for (int i = 0; i < stringArray.length; ) {
            stringArray[i] = "task" + (++i);
        }
        System.out.printf("End of %s\n\n", stringArray[0]);

        //task2
        // вывод значений "вручную"
        System.out.println(integerArray[0] + ", " + integerArray[1] + ", " + integerArray[2]);
        // вывод значений с использованием цикла for и проверки печати запятой после
        // последнего элемента
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf("%f%s", doubleArray[i], i != doubleArray.length - 1 ? ", " : "\n");
        }
        // вывод с использованием цикла foreach с последующей корректировкой строки вывода
        // в требуемом виде
        String resultString = "";
        for (String element : stringArray) {
            resultString = resultString + ", " + element;
        }
        System.out.println(resultString.substring(2));
        System.out.printf("End of %s\n\n", stringArray[1]);

        //task3
        // вывод значений вручную
        System.out.println(integerArray[2] + ", " + integerArray[1] + ", " + integerArray[0]);
        // вывод значений с использованием цикла for и проверки печати запятой после
        // последнего элемента
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.printf("%f%s", doubleArray[i], i != 0 ? ", " : "\n");
        }
        // вывод с использованием цикла foreach с последующей корректировкой строки вывода
        // в требуемом виде
        resultString = "";
        for (String element : stringArray) {
            resultString = ", " + element + resultString;
        }
        System.out.println(resultString.substring(2));
        System.out.printf("End of %s\n\n", stringArray[2]);

        //task4
        for (int i=0; i<integerArray.length;i++) {
            integerArray[i]+=integerArray[i]%2!=0 ? 1:0;
        }
        System.out.println(Arrays.toString(integerArray));
        System.out.printf("End of %s\n\n", stringArray[3]);

    }
}