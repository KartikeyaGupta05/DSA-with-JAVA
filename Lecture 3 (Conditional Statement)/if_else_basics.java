public class if_else_basics {
        public static void main(String[] args) {
            int age = 16;
    
            if (age > 18) {
                System.out.println("You can drive");
            }
            if (age > 13 && age < 18) {
                System.out.println("Teenager");
            } else {
                System.out.println("You cannot drive");
            }
        }
    }
