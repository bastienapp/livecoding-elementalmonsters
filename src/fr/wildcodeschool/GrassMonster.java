package fr.wildcodeschool;

public class GrassMonster extends Monster {

    public GrassMonster(String name, int damage, int life) {
        super(name, damage, life);
        setType("grass");
    }

    @Override
    public void takeHit(Monster adv) {
        int damage = adv.getDamage();
        if (adv.getType().equals("fire")) {
            damage *= 2;
        } else if (adv.getType().equals("water")) {
            damage /= 2;
        }
        this.setLife(this.getLife() - damage);
        showStatus();
    }
}
