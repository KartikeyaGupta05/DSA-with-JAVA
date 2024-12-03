public class Static_Keyword {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.schoolName = "PDDSVM";
        // System.out.println(s1.schoolName);
        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        // Student s3 = new Student();
        // System.out.println(s3.schoolName);

        Horse h = new Horse();
        System.out.println(h.color);
    }
}

// Static Keyword
// class Student {
//     String name;
//     int roll;

//     static String schoolName;  // this main function is agar hamne s1 me declare kara schoolname to bo har student ke declare ho jayega ok.

//     void setName(String newName){
//         this.name = newName;
//     }

//     String getName(){
//         return this.name;
//     }

// }


class Animal {
    String color;
    Animal() {
        System.out.println("animal Constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown";
        System.out.println("Horse Constructor is called");
    }
}