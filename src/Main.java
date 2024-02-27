import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void task1(){
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    public static void task2() {
        Set<Integer> set = new HashSet<>();
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }
        System.out.println(set);
    }
    public static void task3(){
        List<String> words = new ArrayList<>(Arrays.asList("банан",
                "арбуз","дыня","банан","ананас","дыня","кешью","картина","мстители","Зачет","кешью"));
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }
        System.out.println(set);

    }
    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string)+1);
            }
            else{
                map.put(string, 1);
            }
        }
        System.out.println(map.values());
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}