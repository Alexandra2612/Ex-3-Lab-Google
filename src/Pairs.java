public class Pairs {
    public int findPairs(int[] nr){
        int i,j;
        int p=0;
        for(i=0;i<nr.length;i++)
            for(j=i+1;j<nr.length;j++)
               if(nr[i]==(-nr[j])&&nr[i]!=0&&nr[j]!=0){
                   p++;
                   nr[i]=0;
                   nr[j]=0;
               }
        return p;
    }
}
