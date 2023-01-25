class Exceptions1{
    static int division(int[] tab, int indice, int diviseur){
        return tab[indice]/diviseur;
    }
    public static void main(String[] args){
        int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
        int x, y;
        Terminal.ecrireString("Entrez l’indice de l’entier à diviser: ");
        x = Terminal.lireInt();
        Terminal.ecrireString("Entrez le diviseur: ");
        y = Terminal.lireInt();
        Terminal.ecrireString("Le résultat de la division est: ");
        Terminal.ecrireIntln(division(tableau,x,y));
    }
}