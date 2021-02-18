import java.util.ArrayList;

public class FactorANumber {

    // из перевода FactorANumber разложить число на множители

    public ArrayList<Integer> Factor(int numberFromMain){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 2; i <=numberFromMain ; i++) {
            while(numberFromMain%i==0){
                arrayList.add(i);
                numberFromMain/=i;
            }
        }
      return arrayList;
    }
}
