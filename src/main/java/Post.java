import java.util.Arrays;
import java.util.Scanner;

public class Post {

    private double revenu = 0;
    private Package lastPackage = null;

    private Letter[] lettersArray = new Letter[10];
    int indexForArray = 0;

    public double sendPackage(Package somePackage, double someMoney) {
        double rest = 0;
        if (somePackage.pricePackage(somePackage) <= someMoney) {
            somePackage.setStatus("nadana");
            lastPackage = somePackage;
            revenu += somePackage.pricePackage(somePackage);
            return rest = someMoney - somePackage.pricePackage(somePackage);
        }
        if (somePackage.pricePackage(somePackage) > someMoney) {
            return someMoney;
        }
        return rest;
    }

    public Package makePackage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj parametry paczki! Zacznijmy od odbiorcy:");
        String sender = scanner.nextLine();
        System.out.println("Podaj odbiorcę:");
        String reciepent = scanner.nextLine();
        System.out.println("Priorytet?");
        String answear = scanner.nextLine();
        System.out.println("Podaj wagę paczki:");
        int weight = scanner.nextInt();                     // nie może być to w innym miejscu, bo pomija następny kod, dlaczego?
        if (answear.equals("tak")) {
            Package packageFromConsole = new Package(sender, reciepent, weight);
            packageFromConsole.setPriority(true);
            return packageFromConsole;
        }
        Package packageFromConsole = new Package(sender, reciepent, weight);
        return packageFromConsole;
    }

    public Package lastPackage() {
        return lastPackage;
    }

    public double getRevenu() {
        return revenu;
    }

    public Letter[] getLettersArray() {
        return lettersArray;
    }

    public void setRevenu(double revenu) {
        this.revenu = revenu;
    }

    public Package getLastPackage() {
        return lastPackage;
    }

    public void setLastPackage(Package lastPackage) {
        this.lastPackage = lastPackage;
    }

    public double sendLetter(Letter someLetter, double someMoney) {
        double rest = 0;
        if (indexForArray == 11) {
            System.out.println("Przepraszamy, poczta jest w stanie wysłać tylko 10 listów dziennie, i co nam zrobisz?");
            return someMoney;
        }
        if (someLetter.priceLetter(someLetter) <= someMoney) {
            someLetter.setStatus("nadana");
            Letter letterToTable = someLetter;
            revenu += someLetter.priceLetter(someLetter);
            return rest = someMoney - someLetter.priceLetter(someLetter);
        }
        if (someLetter.priceLetter(someLetter) > someMoney) {
            return someMoney;
        }
        return rest;
    }

    @Override
    public String toString() {
        return "Post{" +
                "revenu=" + revenu +
                ", lastPackage=" + lastPackage +
                ", lettersArray=" + Arrays.toString(lettersArray) +
                '}';
    }
}
