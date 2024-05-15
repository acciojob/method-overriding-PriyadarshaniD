public class B extends A{
    public String meth()  {

        System.out.println(super.meth());
        return "Method is overridden in Extendend class B";
    }
    public static void main(String[] args){
        B ob = new B();
        System.out.println(ob.meth());
    }
}
