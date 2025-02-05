public class SuperBox<T extends Animal,U extends Hero,V extends Weapon> {
    private T animal;
    private U hero;
    private V weapon;

    public void setAnimal(T animal){
        this.animal = animal;
    }

    public void setHero(U hero){
        this.hero = hero;
    }

    public void setWapon(V weapon){
        this.weapon = weapon;
    }
    public double totalAttack(){
        return this.animal.run() + this.hero.attack() + this.weapon.onTopAttack() * 1.5;
    }

    public static  void main(String[] args){
        SuperBox<Animal, Hero, Weapon>  s1 = new SuperBox<>();
    s1.setAnimal(new Tiger());
    s1.setHero(new Mage());
    s1.setWeapon(new Bow());
    System.out.println(s1.totalAttack());//6, 1+ 2 +3
    s1.setAnimal(new Panda());
    System.out.println(s1.totalAttack()); // 105, 100+ 2+3
    s1.setWapon(new Sword());
    System.out.println(s1.totalAttack()); // 1102, 100+ 2 + 1000
    }
}
