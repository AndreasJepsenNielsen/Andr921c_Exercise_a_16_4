public class Kap16Opgave4 {

    public static void main(String[] args) {
        LinkedIntList A = new LinkedIntList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(6);
        A.add(7);
        A.add(6);
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(6);
        A.add(7);
        A.add(6);

        lastIndexOf(7,A);
    }
    // kapitel 16 opgave 4

    public static int lastIndexOf(Integer value, LinkedIntList list) {
        int V = 0;
        for (int i = 0; i < list.size(); i++) {
            if (value == list.get(i)) {
                V = i;

            }

        }
        System.out.println(V);
        return V;
    }
}
