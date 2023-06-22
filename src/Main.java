public class Main {
    public static void main(String[] args) {

    interface HavingSuperAbility {
        void applySuperAbility();
    }

    abstract class Hero implements HavingSuperAbility {
        private int health;
        private int damage;
        private String superAbility;

        public Hero(int health, int damage, String superAbility) {
            this.health = health;
            this.damage = damage;
            this.superAbility = superAbility;
        }

        public int getHealth() {
            return health;
        }

        public int getDamage() {
            return damage;
        }

        public String getSuperAbility() {
            return superAbility;
        }
    }

    class Magic extends Hero {
        public Magic(int health, int damage, String superAbility) {
            super(health, damage, superAbility);
        }

        @Override
        public void applySuperAbility() {
            System.out.println("Magic применил суперспособность " + getSuperAbility());
        }
    }

    class Medic extends Hero {
        public Medic(int health, int damage, String superAbility) {
            super(health, damage, superAbility);
        }

        @Override
        public void applySuperAbility() {
            System.out.println("Medic применил суперспособность " + getSuperAbility());
        }
    }

    class Warrior extends Hero {
        public Warrior(int health, int damage, String superAbility) {
            super(health, damage, superAbility);
        }

        @Override
        public void applySuperAbility() {
            System.out.println("Warrior применил суперспособность " + getSuperAbility());
        }
    }
            Hero[] heroes = new Hero[3];
            heroes[0] = new Magic(100, 50, "FIREBALL");
            heroes[1] = new Medic(150, 20, "HEAL");
            heroes[2] = new Warrior(200, 80, "CRITICAL DAMAGE");

            for (Hero hero : heroes) {
                hero.applySuperAbility();
            }
        }
    }
