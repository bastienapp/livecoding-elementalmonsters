package fr.wildcodeschool;

public abstract class Monster {

    private String name;
    private int damage;
    private int life;
    private String type;

    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage = damage;
        this.life = life;
        this.type = "normal";
    }

    public void takeHit(Monster adv) {
        this.life -= adv.getDamage();
        showStatus();
    }

    public void showStatus() {
        if (this.life > 0) {
            System.out.printf("%s has %s points remaining.\n", this.name, this.life);
        } else {
            System.out.printf("%s is KO.\n", this.name);
        }
    }

    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
