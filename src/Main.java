import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
       /* String str =new String ("Java 10");
        BigDecimal number1=new BigDecimal(10.25);
        BigDecimal number2=new BigDecimal(5.75);
        BigDecimal sum=number1.add(number2);
        System.out.println(sum);*/

        BigDecimal number1 = new BigDecimal("10.25");
        BigDecimal number2 = new BigDecimal("5.75");


        BigDecimal sum = number1.add(number2);
        BigDecimal subtract = number1.subtract(number2);
        BigDecimal koboitu = number1.multiply(number2);
        BigDecimal boluu = number1.divide(number2, 2);


        System.out.println( sum);
       System.out.println(subtract);
        System.out.println( koboitu);
        System.out.println( boluu);

    }
}

     //   BigDecimal add(BigDecimal other): эки сандын суммасын кайтарат
      //  BigDecimal subtract (BigDecimal other): эки сандын айырмасын кайтарат
     //   BigDecimal multiply(BigDecimal other): эки сандын кобойтусун кайтарат
      //  BigDecimal  divide(BigDecimal other):  эки сандын болугун кайтарат
       // int compareTo(BigDecimal other):int compareTo(BigDecimal other): эки санды салыштырат. Эгерде
        // учурдагы объект башкасынан кичине болсо -1,
        // учурдагы объект чоңураак болсо 1 жана сандар бирдей болсо 0 кайтарат
       //   static BigDecimal valueOf(double x): мааниси параметр катары берилген санга барабар
        //болгон BigDecimal объектин кайтарат
        //double doubleValue(): преобразует объект BigDecimal в double
        //float floatValue(): BigDecimal объектини floatка айлантат
    //BigDecimal бөлүү (BigDecimal other, RoundingMode режими): режимге жараша тегеректелген
        // эки санды бөлүүнүн натыйжасы
