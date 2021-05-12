package sk.kosickaakademia.spivak.patterns.singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Sun {
    private static Sun sun = new Sun();
    public ArrayList<Planet> planets = new ArrayList<Planet>();

    public ArrayList<Planet> getPlanets() {
        return planets;
    }



    private Sun(){

    }

    public static Sun getInstance(){
        return sun;
    }

    public void AddPlanet(Planet planet){
        planets.add(planet);
        System.out.println("[OKAY] - Planet added");
    }

    public void printAllPlanets(){
        /*
        for(Planet p : planets){
            System.out.println(p.getName());
        }
         */
        System.out.println("List of planets:");

        Iterator<Planet> iterator = planets.iterator();
        while (iterator.hasNext()) {
            Planet planet = iterator.next();
            System.out.println(planet.getName());
        }


    }

    public void findPlanets(String pattern){
        System.out.println("Planets found:");
        String word = pattern.toLowerCase();
        for(Planet p : planets){
            if(p.getName().toLowerCase().contains(word)) {
                System.out.println(p.getName());
            }
        }
    }



}
