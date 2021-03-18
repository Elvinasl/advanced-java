package lt.codeacademy;

public class App {

    public static void main(String[] args) {
        // Kuriamas klase objektas
        Interfeisas kl1 = new Klase();
        System.out.println(kl1.sum(1, 4));

        // Kuriamas interface "Interfeisas" anoniminis klases objektas
        Interfeisas anomObject1 = new Interfeisas() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        // Kuriamas interface "Interfeisas" anoniminis klases objektas
        Interfeisas anomObject2 = new Interfeisas() {
            @Override
            public int sum(int a, int b) {
                return a - b;
            }
        };

        // Panaugojimas
        System.out.println(anomObject1.sum(1, 4));
        System.out.println(anomObject1.sum(1, 4) + anomObject2.sum(12, 10));


        // Pavyzdziai su lambda expression
        // Supaprastintas variantas anoniminio klases objekto
        Interfeisas anomObject3 = (int x, int y) -> {
            return x * y;
        };

        System.out.println(anomObject3.sum(2, 3));

        Interfeisas anomObject4 = (x, y) -> x * y;

        System.out.println(anomObject4.sum(2, 3));
    }
}
