package Ejercicio1;

public class MainE1 {

    public void ejercicio_a() {
        Hilo1 h1 = new Hilo1("hilo1");
        System.out.println(h1);
        h1.start();
    }

    public void ejercicio_b() {
        Hilo2 h2_implements  = new Hilo2("hilo2", 50, 60);
        System.out.println(h2_implements);
        Thread h2 = new Thread(h2_implements);
        h2.start();
    }

    public void ejercicio_c() {
        Hilo1 h1 = new Hilo1("hilo1");
        System.out.println(h1);

        Hilo1 h2 = new Hilo1("hilo2");
        System.out.println(h2);

        Hilo1 h3 = new Hilo1("hilo3");
        System.out.println(h3);

        Hilo1 h4 = new Hilo1("hilo4");
        System.out.println(h4);

        Hilo2 h5_implements  = new Hilo2("hilo5", 10, 600);
        System.out.println(h5_implements);
        Thread h5 = new Thread(h5_implements);

        Hilo2 h6_implements  = new Hilo2("hilo6", 30, 400);
        System.out.println(h6_implements);
        Thread h6 = new Thread(h6_implements);

        Hilo2 h7_implements  = new Hilo2("hilo7");
        h7_implements.setIteracion(20);
        h7_implements.setDemora(500);
        System.out.println(h7_implements);
        Thread h7 = new Thread(h7_implements);

        Hilo2 h8_implements  = new Hilo2("hilo8");
        h8_implements.setIteracion(15);
        h8_implements.setDemora(550);
        System.out.println(h8_implements);
        Thread h8 = new Thread(h8_implements);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        h7.start();
        h8.start();
    }


}
