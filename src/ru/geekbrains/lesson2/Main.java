package ru.geekbrains.lesson2;

public class Main {

    public static void main(String[] args) {
	 int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
	 for (int i = 0; i < a.length; i++)
	 {
         if (a[i] == 0)
             a[i] = 1;
         else
             a[i] = 0;

             System.out.println(a[i]);

     }

	 String st = "0,3,6,9,12,15,18,21";
     String[] stb = st.split(",");
	 int b [] = new int[8];
	 for (int j = 0; j < b.length; j++)
     {
         b[j] = Integer.valueOf(stb[j]);
         System.out.println(b[j]);
     }

	 int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
	 for (int k: c)
     {
         if (k < 6)
           k = k *2;
         System.out.println(k);
     }

        int[][] two = new int[4][4];
        for (int l = 0; l < two.length; l++)
        {
            for (int m = 0; m < two[0].length; m++)
            {
                if (l == m)
                    two[l][m] = 1;
                System.out.print(two[l][m]);
            }
            System.out.println();
        }
    }
}
