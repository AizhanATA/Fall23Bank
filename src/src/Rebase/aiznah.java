package Rebase;

public class aiznah {
    public static void main(String[] args) {
        System.out.println(" Aizhan");
    }
    public String stringYak(String str) {
        String front = "";
        for (int i = 0; i< str.length();i++){
            if (i+2 < str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                i = i+2;
            }
            else {
                front += str.charAt(i);
            }
        }
        return front;

    }
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length -1; i++){
            if (nums[i]==6 && nums[i+1]==6 || nums[i+1]==7){
                count++;
            }
        }
        return count;

    }

}
