public class Practice_Questions {
    public static void main(String[] args) {
        book b1 = new book();
        b1.set();
        System.out.println(book.a + book.b);
    }
}

class book{
    static int a = 10 ;
    static int b;

    static void set(){
        b = a*3;
    }
}
