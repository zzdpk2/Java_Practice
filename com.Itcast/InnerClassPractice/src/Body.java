public class Body {
    
    public class Heart { //member inner class
        public void beat() {
            System.out.println("Heart beats!!!!!");
            System.out.println("My name is " + name + ".");
        }
    }

    private String name;

    public void methodBody() {
        System.out.println("Outer class method!");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
