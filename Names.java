public class Names{
    public static void main(String[] args) {
        String[] strings = {"Aisha", "Jiya", "Arshreet", "preet", "Sam", "Reet"};
        for (int i = 1; i < strings.length; i += 2) {
            System.out.print(strings[i] + " ");
        } 
        for (int i = 0; i < strings.length; i += 2) {
            System.out.print(strings[i] + " ");
        }
    }
}