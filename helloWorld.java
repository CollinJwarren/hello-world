class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("this will be deleted soon");
        //but what if there's also something else here?
        System.out.println("This should overwrite the other thing nvm that was wrong");
        //had to manually resolve the conflicts, doesn't just compare to each thing naturally
    }
}
