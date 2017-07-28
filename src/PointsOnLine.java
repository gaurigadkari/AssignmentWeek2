
public class PointsOnLine {
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
	    HashMap<Double, Integer> result = new HashMap<Double, Integer>();
        int max=0;
     
        for(int i = 0; i < a.size(); i++){
            int duplicate = 1;
            int vertical = 0;
            for(int j = i+1; j < a.size(); j++){
                if(a.get(i) == a.get(j)){
                    if(b.get(i) == b.get(j)){
                        duplicate++;
                    }else{
                        vertical++;
                    }
                }else{
                    double slope = b.get(j) == b.get(i) ? 0.0
    				        : ((1.0 * b.get(j) - b.get(i))/ (a.get(j) - a.get(i)));
     
                    if(result.get(slope) != null){
                        result.put(slope, result.get(slope) + 1);
                    }else{
                        result.put(slope, 1);
                    }
                }
            }
     
            for(Integer count: result.values()){
                if(count+duplicate > max){
                    max = count+duplicate;
                }
            }
     
            max = Math.max(vertical + duplicate, max);
            result.clear();
        }
     
     
        return max;
    }
}
