public class ArrayinFunction {

    public static void update(int marks[]) {
        // marks[0] = 78;
        // marks[1] = 98; 
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {98, 99, 94};
        System.out.print("Before changing in function : " );
        for (int i = 0; i < marks.length; i++) {
            System.out.print( marks[i] + ", ");
        }
        System.out.println();

        update(marks);
        System.out.print("After changing in function : " );
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }
    }
}
