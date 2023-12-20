package IndexOuvrage;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Index {
    TreeMap<String, TreeSet<Integer>> index;
    TreeMap<Integer, TreeSet<String>> indexInverse;
    public Index(TreeMap<String, TreeSet<Integer>> index) {
        this.index = index;
    }
    public void add(String chaine, int nbr){
        TreeSet<Integer> pagesNbrs = index.get(chaine);
        if(pagesNbrs != null){
            pagesNbrs.add(nbr);
            index.put(chaine,pagesNbrs);
        }
        else{
            pagesNbrs = new TreeSet<>();
            pagesNbrs.add(nbr);
            index.put(chaine,pagesNbrs);
        }
    }
    public void Liste(){
        for(Map.Entry<String, TreeSet<Integer>> entree: index.entrySet()){
            String keyword = entree.getKey();
            System.out.println(keyword+": ");

            TreeSet<Integer> pagesNbrs = entree.getValue();
            for(Integer page: pagesNbrs){
                System.out.println(page+" ");
            }
            System.out.println();
        }
    }
    public void IndiceInverse(){
        for(Map.Entry<String, TreeSet<Integer>> entree: index.entrySet()) {
            String keyword = entree.getKey();
            TreeSet<Integer> pages = entree.getValue();
            for( Integer page:pages){
                TreeSet<String> keys = indexInverse.get(page);

                if(keys != null) {
                    keys.add(keyword);
                    indexInverse.put(page,keys);
                }
                else {
                    keys=new TreeSet<>();
                    keys.add(keyword);
                    indexInverse.put(page,keys);
                }
            }
        }
    }
}
