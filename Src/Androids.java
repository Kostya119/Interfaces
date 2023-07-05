class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        display("Call from Android");
    }

    @Override
    public void sms() {
        display("Sending SMS from Android");
    }

    @Override
    public void internet() {
        display("Internet on Android");
    }

    @Override
    public void display(String message) {
        Smartphones.super.display(message);
    }

    @Override
    public void runLinuxCommands() {
        display("Executing Linux Commands on Android");
    }
}