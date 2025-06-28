abstract class PaymentGateway {
    public abstract void processPayment(double amount);
}

class PaytmGateway extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Paytm.");
    }
}

class GPayGateway extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via GPay.");
    }
}

class PhonePeGateway extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via PhonePe.");
    }
}

class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentGateway pay1 = new PaytmGateway();
        PaymentGateway pay2 = new GPayGateway();
        PaymentGateway pay3 = new PhonePeGateway();

        PaymentGateway[] gateways = { pay1, pay2, pay3 };

        for (PaymentGateway gateway : gateways) {
            gateway.processPayment(299.0);
        }
    }
}
