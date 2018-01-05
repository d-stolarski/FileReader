import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Zad03 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("numbers.txt");
        Scanner scan = new Scanner(file);
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (scan.hasNextLine()) {
            int value = 1;
            int key = scan.nextInt();
            if (map.containsKey(key)) {
                value = map.get(key);
                value++;
            }
            map.put(key, value);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            System.out.println(integer + " - liczba wystąpień: " + map.get(integer));
        }
    }
}
