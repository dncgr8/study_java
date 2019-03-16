public class Wizard extends Character {
    int mp;

    @Override
    public void attack(Matango m) {
        System.out.println (this.name+"の攻撃!!!");
        System.out.println ("敵に３ポイントのダメージ");
        m.hp-=20;

    }
    public void fireball(Matango m){
        System.out.println (this.name+"");
        System.out.println ("");
        m.hp -= 20;
        this.mp -= 5;
    }
}
