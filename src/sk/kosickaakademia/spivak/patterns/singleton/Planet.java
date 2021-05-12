package sk.kosickaakademia.spivak.patterns.singleton;

public class Planet {
    private String name;
    private long distance;

    public Planet(String name, long distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public long getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}
