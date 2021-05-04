import java.util.Locale;

public class Mom {

    public static void main63(String[] args) {
        System.out.println(new Darged().addOne());
    }
    public static void main6(String[] args) {
        int i = 0, j =5;
        for (; (i<3) && (j++ <10); i++ )
        {
            System.out.print(i + "" + j);
        }
        System.out.print(i + "" + j);
    }
     public static void main2(String[] args) {
         String s = null;
         try {
             s.toString();
         }catch (NullPointerException e){
             System.out.println(e + "GGGG");

         } catch (Exception e){
             System.out.println(e+ "EEEEEEE");
         }
         System.out.println();

     }
     public static void main0(String[] args) {
          int x  = 0;
          Person p = new Person();
          new Mom().dois(x, p);
         System.out.println(x + " " + p.nu);

     }

     public  void dois(int i, Person p){
         i =5;
     p.nu=8;
 }

    private static class Darged {
        private Integer i =0;
        public int addOne(){
            return  ++i;
        }
    }
}

 class Person {
     public int nu = 0;
 }
