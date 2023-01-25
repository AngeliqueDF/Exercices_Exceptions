class Exceptions1 {
    static int division(int[] tab, int indice, int diviseur) {
        return tab[indice] / diviseur;
    }

    public static void main(String[] args) throws Exception {
        int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
        int x = -1, y = -1;
        boolean entreesValides = false;
        do {
            try {
                Terminal.ecrireString("Entrez l’indice de l’entier à diviser: ");
                x = Terminal.lireInt();
                if (x < 0) {
                    System.out.println("Erreur : l'indice ne peut pas être une valeur négative.");
                    continue;
                } else if (x >= tableau.length) {
                    System.out.println("Erreur : l'indice entré n'existe pas dans ce tableau");
                    continue;
                }
                Terminal.ecrireString("Entrez le diviseur: ");
                y = Terminal.lireInt();
                if (y == 0) {
                    System.out.println("Erreur : imposssible de diviser par 0.");
                    continue;
                }
            } catch (TerminalException e) {
                System.out.println("Erreur, le diviseur et l'indice doivent être des valeurs numériques.");
                continue;
            }
            entreesValides = true;
        } while (!entreesValides);
        Terminal.ecrireString("Le résultat de la division est: ");
        Terminal.ecrireIntln(division(tableau, x, y));
    }
}