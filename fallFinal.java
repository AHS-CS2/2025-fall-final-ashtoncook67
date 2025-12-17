import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fallFinal {
   public static void main(String[] args) {
    File text = new File("fallFinalInput.txt");
    Scanner scan;
    try {
        scan = new Scanner(text);
        int[] nums = new int[200];
        int i = 0;
        while(scan.hasNext()){
            nums[i] = Integer.parseInt(scan.nextLine());
            i++;
        }
        
        for(int y = 0; y < nums.length; y++){
            int numINeed = 2020-nums[y];
            for(int x = y; x < nums.length; x++){
                if(nums[x] == numINeed){
                    System.out.println(nums[y] * nums[x]);
                }
            }
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    
   } 
}
