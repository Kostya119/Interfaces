interface LinuxOS {
    void runLinuxCommands();

    default void display(String message) {
        System.out.println(message);
    }
}