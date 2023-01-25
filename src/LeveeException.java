public class LeveeException {
    public static void main(String[] args) throws NbChoixInsuffisantsExceptions {
        String[] menu1 = {"choix1", "choix2"};
        affichageMenu(menu1);
        String[] menu2 = {"choix3", "choix4", "choix5"};
        affichageMenu(menu2);
    }

    public static int questionReponse(String[] options) throws NbChoixInsuffisantsExceptions {
        affichageMenu(options);
        System.out.println("Saisissez l'option de votre choix.");
        return Terminal.lireInt();
    }

    public static void affichageMenu(String[] choixMenu) throws NbChoixInsuffisantsExceptions {
        if (choixMenu.length < 2)
            throw new NbChoixInsuffisantsExceptions();
        System.out.println("Choix de ce menu");
        for (int i = 0; i < choixMenu.length; i++) {
            System.out.println(i + 1 + " - " + choixMenu[i]);
        }
        System.out.println();
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

class NbChoixInsuffisantsExceptions extends Exception {
    NbChoixInsuffisantsExceptions() {
        super("Erreur : le menu doit comprendre au moins deux choix.");
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