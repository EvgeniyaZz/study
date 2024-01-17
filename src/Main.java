public class Main {
    public static void main(String[] args) {
        SingleLinkList<Integer> list = new SingleLinkList<>();
        list.addElement(1);
        list.addElement(34);
        list.addElement(2);
        list.addElement(6);
        list.addElement(193);

        for (Integer element : list) {
            System.out.println(element);
        }

        list.reverse();

        for (Integer element : list) {
            System.out.println(element);
        }
    }
}