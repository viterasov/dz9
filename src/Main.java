import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("зимнее");
        array.add("солнце");
        array.add("поздно");
        array.add("встает");
        System.out.println(array);

        array.remove(2);
        {
            System.out.println(array);

            System.out.println(array.indexOf("зимнее"));
            System.out.println(array.contains("встает"));
            System.out.println();


        }
        LinkedList<String> linked = new LinkedList<>();
        linked.add("гляжу");
        linked.add("поднимается");
        linked.add("медленно");
        linked.add("в");
        linked.add("гору");
        System.out.println(linked);

        linked.remove(2);
        System.out.println(linked);


            System.out.println(linked.indexOf("гору"));
            System.out.println(linked.contains("гляжу"));


    }
}


