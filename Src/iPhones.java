class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        display("Call from iPhone");
    }

    @Override
    public void sms() {
        display("Send SMS from iPhone");
    }

    @Override
    public void internet() {
        display("Internet on iPhone");
    }

    @Override
    public void display(String message) {
        Smartphones.super.display(message);
    }

    @Override
    public void runiOSCommands() {
        display("Execute iOS Commands on iPhone");
    }
}