package fr.wildcodeschool;

public class Arena {

    public static void main(String[] args) {

        Monster carapuce = new WaterMonster("Carapuce", 10, 100);
        Monster reptincel = new FireMonster("Reptincel", 12, 92);
        Monster tondi = new GrassMonster("Tondizare", 78, 7);

        reptincel.takeHit(carapuce);
        carapuce.takeHit(reptincel);
        reptincel.takeHit(tondi);
        tondi.takeHit(reptincel);
    }
}
