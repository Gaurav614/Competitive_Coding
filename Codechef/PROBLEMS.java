/*
August Challenge Division 2
Problem Sort
Problem Code: PROBLEMS
 */
import java.util.*;
public class Main{
    static class subtask{
       
        int ns;
        int sc;
    }
    static class prob{
         subtask st[] ;
          int index;
        int diff;
        prob(int x){
            st=new subtask[x];
            diff=0;
        }
        
    }
    public static void main(String args[]) {
        Scanner inp=new Scanner(System.in);
        int p=inp.nextInt();
        int s=inp.nextInt();
        int i,j;
        prob arr[]=new prob[p];
        for(i=0;i<p;i++){
            arr[i]=new prob(s);
        
            for(j=0;j<s;j++)
            {
                arr[i].st[j]=new subtask();
                arr[i].st[j].sc=inp.nextInt();
            }
            for(j=0;j<s;j++)
            arr[i].st[j].ns=inp.nextInt();
        
            Arrays.sort(arr[i].st,new Comparator<subtask>()
            {
              public  int compare(subtask ob1,subtask ob2){
                return ob1.sc - ob2.sc;}
            }
            );
        }
        for(i=0;i<p;i++){
            arr[i].index=i;
            for(j=0;j<s-1;j++)
            if(arr[i].st[j].ns>arr[i].st[j+1].ns)
            arr[i].diff=arr[i].diff+1;
            
        }
        Arrays.sort(arr,new Comparator<prob>(){
         public   int compare(prob ob1,prob ob2){
                if(ob1.diff==ob2.diff)
                return ob1.index-ob2.index;
                else
                return ob1.diff-ob2.diff;
            }
        });
        for(i=0;i<p;i++)
        System.out.println(arr[i].index+1);
        
        
    }
}
