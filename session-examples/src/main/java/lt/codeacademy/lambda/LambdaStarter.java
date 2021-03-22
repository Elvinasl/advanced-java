package lt.codeacademy.lambda;

public class LambdaStarter {
    public static void start() {
        // sukurti skaiciuotuva
        Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();
        System.out.println("paprasta implementacija: " + skaiciuotuvas.sumuok(10, 40));

        // panaudoti anonimini sumatoriaus metoda
        Sumatorius sumatorius = new Sumatorius() {
            @Override
            public int sumuok(int x, int z) {
                return x + z;
            }
        };
        System.out.println("sumatorius implementacija panaudojant anonimini objekta: " + sumatorius.sumuok(10, 40));

        // sukurti lambda is inteface sumatorius
        Sumatorius lambdaSumatorius = (int x, int z) -> {
            return x + z;
        };

        System.out.println("sumatorius implementacija panaudojant lambda: " + lambdaSumatorius.sumuok(10, 40));

        Sumatorius shortSumatoriusLambda = (x, z) -> x + z;
        System.out.println("sumatorius implementacija panaudojant shorthand lambda: " + shortSumatoriusLambda.sumuok(10, 40));

        Sumatorius shortSumatoriusLambdaMethodRef = Integer::sum;
        System.out.println("sumatorius implementacija panaudojant shorthand lambda method reference: " + shortSumatoriusLambdaMethodRef.sumuok(10, 40));
    }
}
