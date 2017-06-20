package ru.geekbrains.lesson3;

import java.util.*;

public class Main {

    private static Box box1 = new Box(1, 1);
    private static Box box2 = new Box(2, 2);
    private static Box box3 = new Box(3, 3);

    public static void main(String[] args) {
        demoArrayList();
        demoLinkedList();
        demoHashSet();
        demoLinkedHashSet();
        demoHashMap();
        demoLinkedHashMap();
        demoTreeHashMap();
    }

    private static void demoArrayList(){
        System.out.print("ArrayList: ");
        ArrayList<Box> list = new ArrayList<>();
        list.add(box1);
        list.add(box2);
        list.add(box3);
        System.out.println(list);

        System.out.println("Iterator ArrayList");
        Iterator<Box> iterator = list.iterator();
        while(iterator.hasNext()){
            Box box = iterator.next();
            System.out.println(box);
        }
        for (Box box : list) System.out.println(box);
    }

    private static void demoLinkedList(){
        System.out.print("LinkedList: ");
        LinkedList<Box> linkListBoxes = new LinkedList<>();
        linkListBoxes.add(box1);
        linkListBoxes.add(box2);
        linkListBoxes.add(box3);
        System.out.println(linkListBoxes);
    }

    private static void demoHashSet(){
        System.out.print("HashSet: ");
        HashSet<Box> set = new HashSet<>();
        set.add(box1);
        set.add(box2);
        set.add(box3);
        System.out.println(set);
        System.out.println("Iterator HashSet");
        Iterator<Box> iteratorBox = set.iterator();
        while(iteratorBox.hasNext()) System.out.println(iteratorBox.next());
    }

    private static void demoLinkedHashSet(){
        System.out.print("LinkHashSet: ");
        LinkedHashSet<Box> linkedHashSetBoxes = new LinkedHashSet<>();
        linkedHashSetBoxes.add(box1);
        linkedHashSetBoxes.add(box2);
        linkedHashSetBoxes.add(box3);
        System.out.println(linkedHashSetBoxes);
    }

    private static void demoTreeSet(){
        System.out.print("TreeSet: ");
        TreeSet<Box> treeSetBoxes = new TreeSet<>();
        treeSetBoxes.add(box3);
        treeSetBoxes.add(box2);
        treeSetBoxes.add(box1);
        System.out.println(treeSetBoxes);
    }

    private static void demoHashMap(){
        System.out.print("HashMap: ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("C", 3);
        hashMap.put("B", 2);
        System.out.println(hashMap);


        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> mapIterator = set.iterator();
        while (mapIterator.hasNext()){
            Map.Entry<String, Integer> entry = mapIterator.next();
            System.out.print(entry.getValue() + " ");
        }
//        foreach
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) System.out.print(entry.getValue() + " ");
    }

    private static void demoLinkedHashMap(){
        System.out.print("LinkedHashMap: ");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("C", 3);
        linkedHashMap.put("B", 2);
        System.out.println(linkedHashMap);
    }

    private static void demoTreeHashMap(){
        System.out.print("TreeHashMap: ");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        System.out.println(treeMap);
    }
}