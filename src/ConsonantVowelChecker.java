import java.util.Scanner;

public class ConsonantVowelChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string;
        System.out.println("Enter any String: ");
        string = input.nextLine();
        int total_consonant=0, total_vowel=0;
        for (int i=0;i<string.length();i++){
            char charName = string.toUpperCase().charAt(i);
            if(charName=='A' || charName=='E' || charName=='I' || charName=='O' || charName=='U'){
                total_vowel+=1;
            }
            else {
                total_consonant+=1;
            }
        }
        System.out.println("Total Consonant: "+total_consonant);
        System.out.println("Total Vowel: "+total_vowel);
    }
}
