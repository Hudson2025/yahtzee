import java.util.Arrays;

public class yahtzee extends Die6
{
    private Die6[] dice = {
            new Die6(),
            new Die6(),
            new Die6(),
            new Die6(),
            new Die6(),
        };
    private String str1 = "";
    private String str2 = "";
    private int counter;
    private int c;
    
    public yahtzee(){
            
    }
    
    public void roll(){
        for (int i = 0; i < 5; i++) {
            dice[i].roll();
        }
    }
    
    public void roll(int dieNumber) {
        dice[dieNumber - 1].roll();
        return;
    }
    
    public String toString() {
        str1 = "Dice values:";
        for(int a = 0; a < 5; a++) {
            str1 += dice[a].getValue() + "";
        }
        return str1;
    }
    
    public String summarize() {
        for (int c = 1; c <= 6; c++) {
            counter = 0;
            for (int b = 0; b < 5; b++) {
                if (dice[b].getValue() == c) {
                    counter++;
                }
            }
        }
        return str2;
    }
}
 