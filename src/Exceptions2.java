class Exceptions2 {
    static void methode1(int p) {
        Terminal.ecrireStringln("Debut d’execution de methode1");
        if (p == 0) {
            throw new Exc1();
        }
        Terminal.ecrireStringln("Milieu d’execution de methode1");
        if (p == 1) {
            throw new Exc2();
        }
        Terminal.ecrireStringln("Fin d’execution de methode1");
    }

    static void methode2(int p) {
        Terminal.ecrireStringln("Debut d’execution de methode2");
        if (p == 2) {
            throw new Exc3();
        }
        Terminal.ecrireStringln("Milieu d’execution de methode2");
        methode1(p);
        Terminal.ecrireStringln("Fin d’execution de methode2");
    }

    static void methode3(int p) {
        Terminal.ecrireStringln("Debut d’execution de methode3");
        try {
            methode2(p);
        } catch (Exc2 ex) {
            Terminal.ecrireStringln("Debut d’execution de methode3");
        }
        Terminal.ecrireStringln("Fin d’execution de methode3");
    }

    public static void main(String[] args) {
        Terminal.ecrireString("Entrez un nombre: ");
        methode3(Terminal.lireInt());
    }
}


class Exc1 extends RuntimeException {
}

class Exc2 extends RuntimeException {
}

class Exc3 extends RuntimeException {
}