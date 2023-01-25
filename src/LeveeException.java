public class LeveeException {
    public static void main(String[] args) {
        try {
            System.out.println(saisirChoix((int) (Math.random() * 1000)));
        } catch (TerminalException e) {
            System.out.println("Erreur : vous vous devez entrer une valeur numérique.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int saisirChoix(int n) throws Exception {
        if (n <= 1) {
            throw new ValeurNInvalideException();
        }
        System.out.println("Saisissez une valeur numérique");
        int valeur = 0;
        try {
            valeur = Terminal.lireInt();
        } catch (TerminalException e) {
            throw new FormatValeurEntreeInvalideException();
        }
        if (valeur < 1 || valeur > n)
            throw new ValeurHorsIntervalle(n);
        return valeur;
    }
}

class ValeurNInvalideException extends Exception {
    ValeurNInvalideException() {
        super("Erreur : n doit être strictement supérieur à 1.");
    }
}

class FormatValeurEntreeInvalideException extends Exception {
    FormatValeurEntreeInvalideException() {
        super("Erreur : entrez une valeur numérique.");
    }
}

class ValeurHorsIntervalle extends Exception {
    ValeurHorsIntervalle(int n) {
        super("Erreur : la valeur choisie doit être comprise entre " + n + " et 1.");
    }
}