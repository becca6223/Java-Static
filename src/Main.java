public class Main {

    public static void main (String[] args) throws Exception {
        for(int i = 0; i < 4; i++) {
            Person person = new Person();
            System.out.println("local count: " + person.localCount + " total count: " + Person.instanceCount);
        } //testing
    }
}
