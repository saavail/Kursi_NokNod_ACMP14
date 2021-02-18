public class Nok {



    public int SearchNok(int firstNumberFromMain, int secondNumberFromMain ){
        int cell;

        if(firstNumberFromMain>secondNumberFromMain){
            cell=firstNumberFromMain;
        }else cell=secondNumberFromMain;


        for (int i = cell; i <Math.pow(cell,2) ; i++) {
            if(cell%firstNumberFromMain==0 && cell%secondNumberFromMain==0){

                break;
            }
            cell++;
        }
        System.out.println("НОK чисел "+firstNumberFromMain+" и "+secondNumberFromMain+" - "+cell);
        return cell;
    }
}
