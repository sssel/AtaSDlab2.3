import javax.sound.midi.Sequence;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.LinkedList;
public class ThirdLvl {
    LinkedList StudList;

    ThirdLvl(int[] Sequence){
        StudList = new LinkedList();
        LexForFactorial(Sequence);
        writeToFile();
    }
    public LinkedList getList(){
        return StudList;
    }
    public void writeToFile(){
        try(PrintWriter writer = new PrintWriter("D://University//2 course//2s//ASD//lab2.3//src//lvl3.txt"))
        {
            for(int i=0; i < StudList.size(); i++) {
                writer.println(StudList.get(i)+" ");
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void LexForFactorial(int[] Sequence){
        while(true){
            String s ="";
            for(int i=0; i<Sequence.length;i++){
                s = String.format(s + " " + Sequence[i]);
            }
            StudList.addLast(s);
            int m;
            for(m = Sequence.length - 2 ; m > -1; m-- ) {
                if (Sequence[m] < Sequence[m + 1]) {
                    break;
                }
            }
            if(m<0){
                return;
            }
            int seqM = Sequence[m+1];
            int minPos = m+1;
            for(int i = m+1; i<Sequence.length; i++){
                if((Sequence[m]<Sequence[i]) && (Sequence[i]<=seqM)){
                    minPos = i;
                }
            }
            int temp = Sequence[m];
            Sequence[m]=Sequence[minPos];
            Sequence[minPos] = temp;
            int i=m+1;
            int k = Sequence.length - 1;
            while (k>i){
                int tmp = Sequence[i];
                Sequence[i] = Sequence[k];
                Sequence[k]=tmp;
                i++;
                k--;
            }
        }
    }

}


