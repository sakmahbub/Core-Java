package chapter13;

public class TestSapBigi {

    public static void main(String[] args) {

        Object[] obj = {new Sap(), new Bigi(), new Male(), new Female()};
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof Animal) {
                System.out.println(((Animal) obj[i]).work());

            }
            if (obj[i] instanceof Man) {
                System.out.println(((Man) obj[i]).need());
            }
        }
    }
}
