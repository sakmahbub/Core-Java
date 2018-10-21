package chapter7;

public class ThreeDimentionalArray {

    public static void main(String[] args) {
        //twoD Array
        int x[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {20, 25, 65, 75}

        };
        //twoD Array
        int y[][] = {
            {30, 40},
            {35, 45},
            {65, 75}

        };

        int threeD[][][] = {
            {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {20, 25, 65, 75}

            },
            {
                {30, 40},
                {35, 45},
                {65, 75}

            }
        };

        for (int twoD[][] : threeD) {
            for (int oneD[] : twoD) {
                for (int i : oneD) {
                    System.out.print(i + " ");

                }
                System.out.println();

            }
            ////////////number2EX////////////
            System.out.println("Another Ex threeD");
            int m[][][] = {
                {
                    {5, 10, 15},
                    {20, 25, 30}
                },
                {
                    {35, 40, 50},
                    {55, 36, 45}

                },
                {
                    {70, 85, 95},
                    {95, 60, 70}
                }

            };
            for (int n[][] : m) {
                for (int o[] : n) {
                    for (int q : o) {
                        System.out.print(q + " ");

                    }
                    System.out.println();

                }

            }
        }

    }

}
