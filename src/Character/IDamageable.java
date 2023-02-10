package Character;

public interface IDamageable {


    double maxHealth();

    double health();

    boolean isDead();

    String receiveDamage(double amount);

    String heals(double amount);







}
