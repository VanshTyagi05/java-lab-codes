import java.util.Scanner;  

public class UniversitySelector {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Input GRE and TOEFL Scores  
        System.out.print("Enter your GRE score: ");  
        int greScore = scanner.nextInt();  

        System.out.print("Enter your TOEFL score: ");  
        int toeflScore = scanner.nextInt();  

        // Determine University and Department  
        String university = "";  
        String department = "";  

        // Using if-else statements  
        if(greScore>=70){
            // university will be 
            switch(toeflScore) {
                case 70:{
                    department="Cse";
                }
                case 60:{
                    department="ece";
                }
                case 50:{
                    department="electrical";
                }
        }
    }

        // Using switch-case for output  
       

       
    }  
}
