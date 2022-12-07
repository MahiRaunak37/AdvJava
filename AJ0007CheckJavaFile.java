import java.util.Scanner;

public class AJ0007CheckJavaFile {

    String meth(String s) {
        boolean b = s.endsWith(".java");
        return b == true ? "Given file is java file" : "Given file is not a java file";
    }

    public static void main(String[] args) {
        System.out.println(new AJ0007CheckJavaFile().meth(new Scanner(System.in).nextLine()));
    }
}
