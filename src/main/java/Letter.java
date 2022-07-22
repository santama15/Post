public class Letter {

    private Address senderAddress;
    private Address recipientAddress;
    private boolean priority;
    private String status = "nadany";

    public Letter(Address senderAddress, Address recipientAddress, boolean priority) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.priority = priority;

    }

    public Letter(Address senderAddress, Address recipientAddress) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }

    public double priceLetter (Letter someLetter) {
        double priceLetter = 0;
        if (someLetter.priority == true) {
            return priceLetter = 8.5;
        } else if (someLetter.priority != true) {
            return priceLetter = 6;
        }
        return priceLetter;
    }

    public Letter(boolean priority, String status) {
        this.priority = priority;
        this.status = status;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "senderAddress=" + senderAddress +
                ", recipientAddress=" + recipientAddress +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
