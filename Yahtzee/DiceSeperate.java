import java.util.ArrayList;
import java.util.List;

public class DiceSeperate {
    private List<Die6> diceList;
    
    public DiceSeperate() {
        diceList = new ArrayList<>();
        diceList.add(new Die6());
    }
    
    public DiceSeperate(int numberOfDice) {
        diceList = new ArrayList<>();
        for (int i = 0; i < numberOfDice; i++) {
            diceList.add(new Die6());
        }
    }
    
    public void rollAllDice() {
        for (Die6 die : diceList) {
            die.roll();
        }
    }
    
    public List<Integer> getAllDiceValues() {
        List<Integer> values = new ArrayList<>();
        for (Die6 die : diceList) {
            values.add(die.getValue());
        }
        return values;
    }
    
    public int getTotalSum() {
        int sum = 0;
        for (Die6 die : diceList) {
            sum += die.getValue();
        }
        return sum;
    }
    
    public void addDie() {
        diceList.add(new Die6());
    }
    
    public int sampleMethod(int y) {
        return y;
    }
}
    
