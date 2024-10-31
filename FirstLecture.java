// Лекция 1

// books : Thinking in Java
// books : Effective Java

//public class FirstLecture {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }
//}

//  Типове данни:

//  int a,b;        variable 
//  a = 1234 ;      literal
//  b = 99;         assignment statement
//  int c = a + b;  combined declaration and assignment statement

//byte - 8 bytes 
//char - 16bytes
//short - 16bytes
//int - 32bytes
//long - 64bytes
//float - 32bytes
//double - 64bytes   
//void, boolean
//
// What is a codepoint and how do we use it:

// данните имат стойност по подразбиране пример: boolean е False, int е 0

// конвертиране на типове:   имплицитно - без загуба на точност, експлицитни - чрез cast

// оператори

// Wrapper types

// Константи и utility методи във wrapper типовете

//Autoboxing
// инициализиране на променлива от тип char с литерал
//char c = 'a';
// инициализиране на Character обект с литерал
//Character ch1 = new Character('a');
// autoboxing: char implicitly converted to Character
//Character ch2 = 'x';
// wrapper to primitive conversion
//char c2 = ch1;

// Низове в Java, те са reference типове.
// те са immutable
// стринг литералите създадени са в специална област на паметта на JVM-a, наречена string pool
// String обектите, създадени с оператор new, се създават в динамичната памет (heap-a) Всеки низ в heap-a е отделна инстанция, дори съдържанието на два и повече низа да е идентично
// String обект може да се превхвърли от heap-a в string pool-a чрез извикване на метода intern()

// Сравняване на string-ове, сравняването на низовете с == е сравнение на съответните референции

// Низове в паметта: string pool vs heap

//String literalOne = "FMI"; // goes to String pool
//String literalTwo = "FMI"; // "FMI" is present in the String pool -> literalTwo will refer to the same object

// Низове - литерали, конкатениране
//String language = "Java";
//String tbd = null;
//String message = "I <3" + language;
//String year = "The current year is" + 2023;

//Многоредови низови литерали
// multi-line string literals since Java 15: text blocks for multi-line string literals
//String html = """
//                    <html>
//                        <body>
//                            <p>Hello world!</p>
//                        <body>
//                    <html>
        
//        """;

// Низове - обхождане 

// String.split()


//Math.min(v1, v2);