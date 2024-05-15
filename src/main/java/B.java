public class B extends A{
    public static String meth()  {
        //super.meth();
        return "Method is overridden in Extendend class B";
    }
    public static void main(String args[]){
        B objb = new B();

        String s= A.meth();
                System.out.println(s);

        String s1= meth();
                System.out.println(s1);
    }
}
