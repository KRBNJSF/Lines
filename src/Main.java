public class Main {

    static Line p = new Line(2, 2, 1, 5);
    static Line z = new Line(2, 2, 1, 5);

    public static void main(String[] args) {
        System.out.println(p.calculateC(p));
        System.out.println(z.calculateC(z));

        System.out.println(z.generalLine());
        new Hub();
        Line q = new Line(2.0, 2.0, 1, 1);
        Line v = new Line(-1, 3, -16);
        Line e = new Line(-1, 3, -4);

        System.out.println("Průsečík: [" + p.sourX + ";" + p.calculateLineRelation(p, z, 3) + "]");


        p.checkPoint(3, -1, p);

        System.out.println("Parametrické vyjádření přímky: \n" + p.parametricLine());
        System.out.println("Vector X: " + p.directionalVectorX() + ", Vector Y: " + p.directionalVectorY());
        System.out.println("Normal X: " + p.normalVectorX() + ", Normal Y: " + p.normalVectorY());
        System.out.println("Obecné vyjádření přímky: " + p.generalLine());
        System.out.println("Smernicovy tvar primky: " + p.straightLineShape());
        //System.out.println("Vzdalenost mezi primkami: " + v.distanceBetweenLines());
    }

}
