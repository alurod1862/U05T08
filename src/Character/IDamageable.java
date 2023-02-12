package Character;

//Interfaz para variables
public interface IDamageable {

    //Variable para saber el maximo de vida de un personaje
    double maxHealth();

    //Variable para saber la vida acutal de un personaje
    double health();

    //Variable para saber si el personaje esta muerto
    boolean isDead();

    //Variable para saber el daño recibido
    String receiveDamage(int amount);

    //Variable para curar al personaje
    String heals(int amount);

    //Variable para curar al personaje con comida o pociones
    String cure(int amount);







}
