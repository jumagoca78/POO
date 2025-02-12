public class Time3Test {

    public static void main (String miVariable[]){

        Time3 mireloj =new Time3(11,50,55);
        Time3 mireloj2 =new Time3(mireloj);
        
        System.out.println("La hora universal es: " +
                            mireloj2.toUniversalString());

    }

    
}
