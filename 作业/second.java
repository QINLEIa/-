public class second {
    public static void main(String[] args) {
        int[] a = new int[200];
        a[0] = 0;
        a[1] = 1;
        int i = 2;
        while (i < 100) {
            a[i] = a[i-1] + a[i-2];
            i++;

        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
}