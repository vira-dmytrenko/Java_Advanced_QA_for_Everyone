package HW6;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        Fighter f1;
        Fighter f2;
        if (fighter1.name.equals(firstAttacker)){
            f1 = fighter1;
            f2 = fighter2;
        } else {
            f1 = fighter2;
            f2 = fighter1;
        }

            do {
                f2.health -= f1.damagePerAttack;
                if (f2.health <= 0) {
                    return f1.name;
                }
                f1.health -= f2.damagePerAttack;
            } while (f1.health > 0);

        return f2.name;
    }
}
