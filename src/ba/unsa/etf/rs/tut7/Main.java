package ba.unsa.etf.rs.tut7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int tok;

        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer br1, Integer br2) {
                int sumaCifara1 = 0;
                while (br1 != 0) {
                    sumaCifara1 += br1 % 10;
                    br1 /= 10;
                }
                int sumaCifara2 = 0;
                while (br2 != 0) {
                    sumaCifara2 += br2 % 10;
                    br2 /= 10;
                }
                return sumaCifara1 - sumaCifara2;
            }
        };

        niz.clear();
        System.out.println("Unesite niz brojeva: ");
        tok = scanner.nextInt();
        while (tok != 0) {
            niz.add(tok);
            tok = scanner.nextInt();
        }
        System.out.println();
        ArrayList<Integer> arrayListStreamAPI = (ArrayList<Integer>) niz.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println("Sortiran niz uz pomoc java stream API-ja glasi: ");
        for(int i: arrayListStreamAPI) {
            System.out.print(i + " ");
        }


    }



}
