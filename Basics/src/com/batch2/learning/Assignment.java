package com.batch2.learning;

import java.util.*;

public class Assignment {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("mani", "mani", "mala", "mala", "manimala", "nagaraju");


        Map<String , Integer> stringIntegerMap = new HashMap<>();

        for(int i = 0;i <stringList.size();i++){
            if(stringIntegerMap.containsKey(stringList.get(i))){
                stringIntegerMap.put(stringList.get(i), stringIntegerMap.get(stringList.get(i))+ 1);
            }else {
                stringIntegerMap.put(stringList.get(i), 1);
            }
        }

        for(Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()){
            if(stringIntegerEntry.getValue() == 1){
                System.out.println(stringIntegerEntry.getKey());
            }
        }

        /*String str = "Queue";

        Map<String, Integer> map = new HashMap<>();

        map.put("Manimala", 1000);
        map.put("Mani", 1000);
        map.put("Mala", 1000);
        map.put("Nagaraju", 2000);

        List<MapObject> mapObjects = new ArrayList<>();

       for(Map.Entry<String, Integer> entry : map.entrySet()){
           mapObjects.add(new MapObject(entry.getKey(), entry.getValue()));
           //Comparator.comparing()
       }


       mapObjects
               .stream()
               .sorted(Comparator.comparing(MapObject::getValue).thenComparing(MapObject::getName).reversed())
               .limit(2)
               .forEach(System.out::println);*/



    }
}

class MapObject {
    private String name;
    private Integer value;

    public MapObject(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MapObject{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
