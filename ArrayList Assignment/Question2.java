import java.util.ArrayList;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int a = 0;
        int b = 101;
        int ans = 0;
        
        for(int i = nums.size()-1; i>-1; i--){
            a = nums.get(i);
            
            if(a < b){
                ans = a;
                b = a;
            }else{
              ans = b;
            }
        }
        for(int i = nums.size()-1; i>-1;i--){
            if(ans == nums.get(i)){
                nums.remove(i);
            }
        }
        
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
