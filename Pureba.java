public class Pureba {
    public static void main(String[] args) {
        String a = "hola";
        String b = 'h' + "o" + 'l' + "a" + "";
        boolean c = a.equals(b);
        boolean e = !c;
        char f = 'f';
        char g = 'f';
        boolean h = g != f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
