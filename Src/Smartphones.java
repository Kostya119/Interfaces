interface Smartphones {
    void call();
    void sms();
    void internet();

    default void display(String message) {
        System.out.println(message);
    }
}