package com.epam.rd.autotasks.max;

public class MaxMethod {

    //int[] vals = {-2, 0, 10, 5};
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        int result = values[0];
        for (int i=1; i<values.length; i++) {
            if (values[i]>result){
                result = values[i];
            }
          }
        return (result);
    }
    //int res = max(vals);

}
