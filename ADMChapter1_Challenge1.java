package admchapter1_challenge1;

/** 
 * @Book: The Algorithm Design Manual
 * @Author Name: Madeline Merced
 * @Assignment Name: admchapter1_challenge1
 * @Date: Jan 29, 2020
 * @Description: Java solution to the 3n+1 challenge from Chapter 1. 
 */

//Begin Class ADMChapter1_Challenge1
public class ADMChapter1_Challenge1 {

    //Begin Main Method
    public static void main(String[] args) {
        
        //Pass inputs to function to check each int within the range 
        cyclesRange(201,210);
        
    } //End Main Method
    
    /*
    Function to work within the set range. 
    */
    public static int cyclesRange(int i, int j){
     int min_range = i;
     int max_range = j;
     int maxCycle = 0;
     
     //For loop to pass each number within the range to the cycleLength counter   
     for(int t = min_range; t <= max_range; t++){
         
         //Pass current int to the cycleLength function
           int cycle = getCycleLength(t);
            
            //Maintains maxCycle 
           if(maxCycle < cycle){
               maxCycle = cycle;
           }
        }
        
        //Prints inputs and max cycle results to the console
        System.out.print(i +" "+ j + " "+ maxCycle + "\n");
        return maxCycle;
    }
    /*
    Function to check the cycle length of int
    */
    public static int getCycleLength(int n){        
        if(n == 1){
            return 1;
           
        }else if(n % 2 == 0){
            return 1 + getCycleLength(n/2);
        
        }else{
            return 1 + getCycleLength(n*3 + 1);
        }
    }
    
} //End Class ADMChapter1_Challenge1
