public class larger{
    public static int greatests(int numbs[]){
        int largest=Integer.MIN_VALUE; //-infinity value
        for(int i=0;i<numbs.length;i++){
            if(largest<numbs[i])
            largest=numbs[i];
        }
        return largest;

    }
    public static void main(String[] args) {
     int numbs[]={1,4,3,5,6,7};
     System.out.println("largest number is"+ greatests(numbs));
    }
}


