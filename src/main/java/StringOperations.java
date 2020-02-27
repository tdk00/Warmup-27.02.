import java.util.*;

public class StringOperations {


    public static void main(String[] args) {
        String str="Hello worldd";
        char [] ch=str.toCharArray();
        Set<Character> set=new HashSet<Character>();
        HashMap<Character,Integer> mapCount= new HashMap<Character, Integer>();
        HashMap<Character,List<Integer>> mapPosition= new HashMap<Character, List<Integer>>();
        List <Integer> list=new ArrayList<>();
        HashMap<HashMap<Character,Integer>,List> triple= new HashMap<>();

        for (int i=0;i<ch.length;i++) {
            if(mapCount.containsKey(ch[i])){
                mapCount.put(ch[i],mapCount.get(ch[i])+1);

            }
            else{
                mapCount.put(ch[i],1);
            }

        }

        for(Map.Entry<Character,Integer> entry:mapCount.entrySet()){
            System.out.printf("Character %c : %s\n",entry.getKey(),entry.getValue() );
        }

        for(Map.Entry<Character,Integer> entry:mapCount.entrySet()){

            for(int i=0;i<ch.length;i++){
                if(ch[i]==entry.getKey()){
                    list.add(i);
                }

            }
           List <Integer> copy=new ArrayList<>();
            copy.addAll(list);
            mapPosition.put(entry.getKey(),copy);
            list.clear();


        }
        for(Map.Entry<Character,List<Integer>> entry:mapPosition.entrySet()){
            System.out.printf("Character %c : %s\n",entry.getKey(),entry.getValue() );
        }

//
//        for(Map.Entry<Character,Integer> entrySet:mapCount.entrySet()){
//           triple.put(mapCount.entrySet(),mapPosition.get(entrySet.getValue()));
//        }







    }

}
