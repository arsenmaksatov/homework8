package kg.geektech.game.players;

public abstract class Berserk extends Hero {

    private int doubleDamage;

    public Berserk(int health, int damage, int doubleDamage) {
        super(health, damage, SuperAbility.SAVE_AND_REVERT);
        this.doubleDamage = doubleDamage;
    }

    public int getDoubleDamage() {
        return doubleDamage;
    }

    public void setDoubleDamage(int doubleDamage) {
        this.doubleDamage = doubleDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - doubleDamage);
    }
}