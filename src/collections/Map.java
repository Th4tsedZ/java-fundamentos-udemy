package collections;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> aprovados = new HashMap<>();

        aprovados.put(1, "Pedro");
        aprovados.put(2, "Ana");
        aprovados.put(3, "Bia");
        aprovados.put(4, "Carlos");

//        System.out.println(aprovados.entrySet());
//        aprovados.put(3, "Beatriz");
//        System.out.println(aprovados.get(3));
//        System.out.println(aprovados.containsKey(4));
//        System.out.println(aprovados.containsValue("Beatriz"));

        System.out.println(aprovados.entrySet());

//        System.out.print("Keys: ");
//        for (Integer key : aprovados.keySet()){
//            System.out.print(key + " ");
//        }
//
//        System.out.print("\nValores: ");
//        for (String value : aprovados.values()){
//            System.out.print(value + " ");
//        }
//
//        System.out.print("\nKeys + valores: ");
//        for (java.util.Map.Entry<Integer, String> kvalores : aprovados.entrySet()){
//            System.out.print(kvalores + " ");
//        }
    }
}
