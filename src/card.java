public class card {
    String name;
    String class1;
    int health;
    int attack;
    int speed;

    public String getName() {
        return name;
    }

    public String getClass1() {
        return class1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void brawl(card enemy) {
        if (this.getSpeed() > enemy.getSpeed()) {
            int damage = this.getAttack();
            int enemyHealth = enemy.getHealth();
            int speed = this.getSpeed();
            System.out.println("You have " + speed + " speed. You go first.");
            enemy.setHealth(enemyHealth - damage);
            if (enemy.getHealth() < 1) {
                System.out.println("You dealt " + damage + " damage" + "\n" + enemy.getName() + " has died.");
            }
            else {
                System.out.println("You dealt " + damage + " damage" + "\n" + enemy.getName() + " has " + enemy.getHealth() + " health.");
            }
        }
        else {
            int enemyDamage = enemy.getAttack();
            int health = this.getHealth();
            int enemySpeed = enemy.getSpeed();
            System.out.println("They have " + enemySpeed + " speed. They go first.");
            this.setHealth(health - enemyDamage);
            if (this.getHealth() < 1) {
                System.out.println("They dealt " + enemyDamage + " damage" + "\n" + this.getName() + " has died.");
            }
            else {
                System.out.println("THey dealt " + enemyDamage + " damage" + "\n" + this.getName() + " has " + this.getHealth() + " health.");
            }
        }
    }

    public boolean healthCheck(card enemy) {
        if (this.getHealth() < 1) {
            return false;
        }
        if (enemy.getHealth() < 1) {
            return false;
        }
    }

    public card(String name, String class1, int health, int attack, int speed) {
        this.name = name;
        this.class1 = class1;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "card{" +
                "name='" + name + '\'' +
                ", class1='" + class1 + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", speed=" + speed +
                '}';
    }
}
