//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//их необходимо считать, как одного человека с разными телефонами.
//Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HomeWork5 {
    public static void main(String[] args) {
        String[] namesarr = new String[]{"Иванов Иван Иванович", "Никитин Никита Никитович",
                "Александров Александр Александрович", "Иванов Иван Иванович", "Сергеев Сергей Сергеевич",
                "Евгеньева Евгения Евгеньевна", "Николаев Николай Николаевич", "Никитин Никита Никитович"};
        Integer[] numbers = new Integer[]{9562876, 9569563, 13281659, 12982378, 222352982,
                95847563, 11511532, 32568974};
        Map<Integer, String> phonehash = new HashMap<>();
        for (int i = 0; i < namesarr.length; i++) {
            phonehash.put(numbers[i], namesarr[i]);
        }
        System.out.println(phonehash);
        System.out.println("=".repeat(300));
        phonehash.entrySet().stream().sorted(Map.Entry.comparingByKey((Comparator<Integer>) (o1, o2) -> o2 - o1)).forEach(System.out::println);
    }
}