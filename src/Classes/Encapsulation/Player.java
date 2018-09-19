package Classes.Encapsulation;

public class Player {
    private String name;
    private int lifePoints;
    private int hitPoints;

    public Player(String name, int lifePoints, int hitPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.hitPoints = hitPoints;
    }

    public void damage (int damage) {
        int tot = 0;
        this.hitPoints = damage;
        if (damage <=0) {
            System.out.println("Your hero" + this.name + " is dead!!");
            tot = this.lifePoints -= damage;
        }
            System.out.println("Your hero got some damage: " + this.hitPoints);
        System.out.println("The life score of you hero is " + tot);
    }

    public void cure (int life) {
        this.lifePoints = life;
        System.out.println("Your hero have restored some of his life " + this.lifePoints);
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
