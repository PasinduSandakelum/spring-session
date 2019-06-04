package com.pasindu.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class F12FIleReading {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("sample-data.text"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();

        System.out.println(list);
    }
}
