import java.util.Random;

public class Package {

    private String sender;
    private String recipient;
    private int weight;
    private boolean priority = false;
    private String status = "utworzona";

    public String getStatus() {
        return status;
    }

    public Package() {
        Random random = new Random();
        int pulledSender = random.nextInt(3);
        int pulledReciepient = random.nextInt(3);
        weight = random.nextInt(100000);
        int pulledPriorityPackage = random.nextInt(2);

        switch (pulledSender) {
            case 0:
                sender = "Karol";
                break;
            case 1:
                sender = "Magda";
                break;
            case 2:
                sender = "Elżbieta";
                break;
        }
        switch (pulledReciepient) {
            case 0:
                recipient = "Damian";
                break;
            case 1:
                recipient = "Michał";
                break;
            case 2:
                recipient = "Karolina";
                break;
        }
        switch (pulledPriorityPackage) {
            case 0:
                priority = true;
                break;
            case 1:
                priority = false;
                break;
        }
    }

    public Package(String sender, String recipient, int weight) {
        if (sender == null) {
            System.out.println("Brak nadawcy");
        } else if (sender != null) {
            this.sender = sender;
        }
        if (recipient == null) {
            System.out.println("Brak nadawcy");
        } else if (recipient != null) {
            this.recipient = recipient;
        }
        if (weight < 0 || weight > 100000) {
            System.out.println("Waga poza zakresem!");
        } else {
            this.weight = weight;
        }
    }

    public double pricePackage(Package somePackage) {
        double price = 0;
        if (somePackage.getWeight() <= 500) {
            price = 5;
            if (somePackage.isPriority()) {
                return price = 1.1 * price;
            } else return price;
        }
        if (somePackage.getWeight() > 500 && somePackage.getWeight() < 1000) {
            price = 8;
            if (somePackage.isPriority()) {
                return price = 1.1 * price;
            } else return price;
        }
        if (somePackage.getWeight() > 1000 && somePackage.getWeight() < 2000) {
            price = 12;
            if (somePackage.priority) {
                return price = 1.1 * price;
            } else return price;
        }
        if (somePackage.getWeight() > 2000) {
            if (somePackage.isPriority()) {
                return price = 1.1 * (12 + (somePackage.getWeight() - 2000) / 1000);
            } else return price = 12 + (somePackage.getWeight() - 2000) / 1000;
        }
        return price;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Package{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
