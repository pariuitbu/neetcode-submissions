class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
       //PriorityQueue<Integer> minHeap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
       //for(int num: map.keySet()){
        //minHeap.offer(num);
        //if(minHeap.size()>k){
          //  minHeap.poll();
        //}

       //} 
       List<Integer> listArr[]=new List[nums.length+1];
       for(int num: map.keySet()){
            int freq=map.get(num);
            if(listArr[freq]==null){
                listArr[freq]=new ArrayList<>();
            }
            listArr[freq].add(num);
       }
        int res[]=new int[k];
        int j=0;
       for(int i=nums.length;i>=0;i--){
            if(listArr[i]!=null){
                int m=0;
                while(m<listArr[i].size() && j<k){
                    res[j]=listArr[i].get(m);
                    m++;
                    j++;
                }
                if(j>=k){
                    break;
                }
                
            }
       }
       
       return res;

    }
}
