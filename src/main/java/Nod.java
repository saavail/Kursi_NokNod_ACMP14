public class Nod {

    public int SearchNod (int firstNumberFromMain, int secondNumberFromMain){
        int result;

        if(firstNumberFromMain>secondNumberFromMain){
            result=firstNumberFromMain;
        }else result=secondNumberFromMain;

        for (int i = result; i >0 ; i--) {
            if (firstNumberFromMain%result==0 && secondNumberFromMain%result==0){

                break;
            }
            result--;
        }
        System.out.println("НОД чисел "+firstNumberFromMain+" и "+secondNumberFromMain+" - "+result);
        return result;
    }
}

