public class ActivityMD02 {
    public static void main (String [] args){
        char [][] JLG_array = new char [10][];
        for (int i = 0; i < JLG_array.length; i++){
            JLG_array[i] = new char [i + 1];

            for (int j = 0; j < JLG_array[i].length; j++){
                JLG_array [i][j] = '*';


            }
        }


        
        for (int i = 0; i < JLG_array.length; i++){

            for (int j = 0; j < JLG_array[i].length; j++){
                System.out.print(JLG_array[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}