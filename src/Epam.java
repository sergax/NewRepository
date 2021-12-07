public class Epam {
    public static void main(String[] args) {
        Test t = new Test();
        t.Result();
        t.Code();
        t.Array();
        t.StrinLine();
        t.FragmentCode();


    }
}
class Test {
    // 9 8 7
    void Result(){
        int num = 9;
        boolean d = false;
        while (!d) {
            System.out.println(num);
            if(num % 7 == 0)
                d = true;
            --num;
        }
    }
    void Code() {
        //222
        String a = "2";
        int b = 2;
        System.out.println( a + b +b);
    }
    void Array() {
        // 3 2
        byte[][] b = {{1,2,3,4},{1,2,3}};
        System.out.println(b[1].length + "" + b.length);
    }
    void StrinLine() {
        String line = "123";
        String line2 = new String("123");
        System.out.println(line == "123");
        System.out.println(line == line2);
    }
void FragmentCode() {
        //Failure
        int x = 50, x1 = 75;
        boolean b = x >= x1;
        if(b == true)
            System.out.println("Success");
        else
            System.out.println("F");
}
}