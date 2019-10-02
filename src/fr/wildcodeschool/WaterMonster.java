package fr.wildcodeschool;

public class WaterMonster extends Monster {

    public WaterMonster(String name, int damage, int life) {
        super(name, damage, life);
        setType("water");
    }

    @Override
    public void takeHit(Monster adv) {
        int damage = adv.getDamage();
        if (adv.getType().equals("grass")) {
            damage *= 2;
        } else if (adv.getType().equals("fire")) {
            damage /= 2;
        }
        this.setLife(this.getLife() - damage);
        showStatus();
    }
}
