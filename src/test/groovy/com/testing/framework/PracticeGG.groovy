package com.testing.framework


class PracticeGG {


    public static void main(String[] args) {

        def s = 0
        def n = 6
        def a, z
        def p
        def x = [3, 5, 9, 7, 1, 4]

        a=x[0]
        for(int i=1; i<n;i++)
            if (x[i]>=a)
            {
                a=x[i]
                p=i
            }
        println x  +" " + p

        // selection sort
/*        for (int i = 0; i < n - 1; i++) {
            z = x[i]
            p = i
            for (int j = i + 1; j < n; j++)
                if (x[j] < z) {
                    z = x[j]
                    p = j
                }
            a = x[i]
            x[i] = z
            x[p] = a
        }
        println x
        println a
        println p
        println z
    }
    */

        /*for (int i = 0; i < x.size(); i++) {
            int min = i;
            for (int j = i; j < x.size(); j++) {
                if (x[min] > x[j])
                    min = j
            }
            int temp = x[i]
            x[i] = x[min]
            x[min] = temp

        }

        println x
    }*/

        for (int i = 1; i < x.size(); i++) {
            int j = i
            int value = x[i]
            while ((j > 0) && (x[j - 1] > value)) {
                x[j] = x[j - 1]
                j--
            }
            x[j] = value

        }

        println x
    }


}
