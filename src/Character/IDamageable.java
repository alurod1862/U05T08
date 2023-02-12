package Character;

public interface IDamageable {


    double maxHealth();

    double health();

    boolean isDead();

    String receiveDamage(int amount);

    String heals(int amount);

    String cure(int amount);







}
