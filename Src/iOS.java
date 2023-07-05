interface iOS {
    void runiOSCommands();

    default void display(String message) {
        System.out.println(message);
    }
}