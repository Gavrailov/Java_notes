public class Uprajnenie_edno 
{
    public static void main(String[] args) 
    {
       
// 1. string literals and the string pool
        System.out.println("========1========");
        String LiteralOne = "FMI"; //goes to the string pool
        String LiteralTwo = "FMI"; //"FMI" is present in the stirng pool, so LiteralTwo will refer to the same object

        System.out.println(LiteralOne == LiteralTwo); // true
        
        String newString = new String("FMI"); // new string object in the heap
        
    }
}
