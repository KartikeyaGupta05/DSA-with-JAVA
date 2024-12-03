public class Constructors {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Kartikeya";
        s1.roll = 12345;
        s1.password = 1253648;
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 97;

        Students s2 = new Students(s1);
        s2.password = 146327;
        s1.marks[2] = 100;
        for (int i : s2.marks) {
            System.out.println(i);
        }
    }
}


class Students{
    String name;
    int roll;
    int password;
    int marks[];

    // This a constructors if we not made a constructors so java khud hi yeah define kar dena, but jab bhi hmm constructors definr karenge to hmm usme kuch saath bhej sakte hai.



    // Non Parameterized Constructor
    Students(){
        marks = new int[3];
        System.out.println("Constructor is called ");
    }

    // Parameterized Constructor
    Students(String newName){
        marks = new int[3];
        this.name = newName;
    }

    Students(int newRoll){
        marks = new int[3];
        this.roll = newRoll;
    }



    // Shallow Copy Constructor  // This make a shallow copy of s1.
    // Students(Students s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = s1.marks;
    // }

    // Deep Copy Constructors
    Students(Students s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}