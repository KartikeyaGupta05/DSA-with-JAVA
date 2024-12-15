import java.util.ArrayList;

public class ArrayList_Basics{
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();

        // ArrayList<String> name = new ArrayList<>();
        // ArrayList<Boolean> list = new ArrayList<>();
        // ArrayList<Float> list2 = new ArrayList<>();

        // add new element in ArrayList  TC = O(1)
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        marks.add(1, 9);  // TC = O(n)

        System.out.println(marks);  // [1, 9, 2, 3, 4]

        // get operation  TC = O(1)
        System.out.println(marks.get(2));  // 2

        // remove operation  TC = O(n)
        marks.remove(1);
        System.out.println(marks);  // [1, 2, 3, 4]

        // set operation  TC = O(n)
        marks.set(2, 10);
        System.out.println(marks);  // [1, 2, 10, 4]

        // conatains operation  TC = O(n)
        System.out.println(marks.contains(10));  // true
        System.out.println(marks.contains(2));  // true
        System.out.println(marks.contains(9));  // false


        // size
        System.out.println(marks.size());  // 4

        for (int i = 0; i < marks.size(); i++) {
            System.out.print(marks.get(i) + " ");
        }
        System.out.println();

        // for (Integer i : marks) {
        //     System.out.print(i + " ");
        // }
    }
}