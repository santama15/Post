public class DemoPost {
    public static void main(String[] args) {


        // first part

        Package firstPackage = new Package("Karol", "Andrzej", 100000);
        Package secondPackage = new Package();

        System.out.println(firstPackage);
        System.out.println(secondPackage);

        System.out.println(firstPackage.pricePackage(firstPackage));

        // zmienne z paczkami

        Package thirdPackage = new Package();
        Package fourthPackage = new Package();
        Package nullPackage = null;

        System.out.println("Cena paczek dla drugiej części zadania: " + firstPackage.pricePackage(thirdPackage));
        System.out.println("Cena paczek dla drugiej części zadania: " + firstPackage.pricePackage(fourthPackage));
        // System.out.println("Cena paczek dla drugiej części zadania: " + firstPackage.pricePackage(nullPackage));

        nullPackage = firstPackage;

        System.out.println("Cena paczki z nulla: " + firstPackage.pricePackage(nullPackage));

        // second part

        Package[] packages = new Package[3];
        packages[0] = firstPackage;
        packages[1] = secondPackage;
        packages[2] = nullPackage;

        System.out.println("Pierwsza paczka z tablicy " + packages[0]);

        // tablica 100 paczek

        Package[] packages100 = new Package[100];

        for (int i = 0; i < 100; i++) {
            Package packageInTabel = new Package();
            packages100[i] = packageInTabel;
        }

        // wyswietlenie paczek

        double totalPrice = 0;
        for (Package xpackage : packages100) {
            System.out.println(xpackage);
            totalPrice += xpackage.pricePackage(xpackage);
        }
        System.out.println(totalPrice);


        //poczta

        Post post = new Post();
        double wallet = 1000;
        double revenue = 0;
        wallet = post.sendPackage(firstPackage, wallet);
        System.out.println("Dane paczki: " + firstPackage + ". Zostało w portfelu: " + wallet);
        revenue = post.getRevenu();
        System.out.println("Przychód poczty: " + revenue);

        //tworzenie paczki na poczcie

        Package packageFromPost = post.makePackage();
        wallet = post.sendPackage(packageFromPost, 500);

        System.out.println("Paczka utworzona na poczcie: " + packageFromPost);
        System.out.println("Stan portfela: " + wallet);

        System.out.println("Ostatnia nadana paczka to: " + post.lastPackage());

        //letter

        Address senderAddress = new Address("Tuwima", 45, "59-500");
        Address recipientAddress = new Address("Sasina", 5, "11=100");

        System.out.println("Adres nadawcy: " + senderAddress);

        Letter firstLetter = new Letter(senderAddress, recipientAddress, true);

        double priceLetter;
        priceLetter = firstLetter.priceLetter(firstLetter);
        System.out.println("Cena listu: " + priceLetter);

        wallet = post.sendLetter(firstLetter, wallet);

        System.out.println("Nadany list to: " + firstLetter);
        System.out.println("Stan portfela to: " + wallet);
    }
}
