package fr.wildcodeschool;

public class FireMonster extends Monster {

    public FireMonster(String name, int damage, int life) {
        super(name, damage, life);
        setType("fire");
    }

    @Override
    public void takeHit(Monster adv) {
        int damage = adv.getDamage();
        if (adv.getType().equals("water")) {
            damage *= 2;
        } else if (adv.getType().equals("grass")) {
            damage /= 2;
        }
        this.setLife(this.getLife() - damage);
        showStatus();
    }
}
