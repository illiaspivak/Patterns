package sk.kosickaakademia.spivak.patterns.singleton;

/**
 * Singleton (Одиночка) - ограничивает создание одного экземпляра класса,
 * обеспечивает доступ к его единственному объекту.
 */
public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance(); //только один экземпляр класса Sun
        Planet earth = new Planet("Earth",149600000l);
        Planet uran = new Planet("Uran",2871000000l);
        Planet saturn = new Planet("Saturn", 1434000000l);
        Planet mars = new Planet("Mars",228000000l);


        sun.addPlanet(earth);
        sun.addPlanet(uran);
        sun.addPlanet(saturn);
        sun.addPlanet(mars);

        sun.printAllPlanets();
        sun.findPlanets("AR");

        sun.minDistance();
        sun.distanceToEarth();
    }
}
