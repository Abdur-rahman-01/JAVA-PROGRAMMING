class arrayss{
//     public static void main (String args[]){
//     int[] arr={1,2,3};
//     for(int i:arr){
//         System.out.println(i);
//     }
//     }
// }
//
// max in array
// public static void main(String[] args) {
//     int [] arr={2,4,3,9,4,5};
//     int max=arr[0];
//     for(int num:arr){
//         if(num>max){
//             max=num;

//         }
//     }
//     System.out.println("max element is:"+max);
        


//     }
    
//}
//sum of array elements
public static void main(String[] args) {
    int arr[]={2,4,5,8,8,7,9,9,5};
    int max=arr[0];
    int sum=0;
    for (int num:arr){
        if(num>max){
        max=num;
        
        }
    }
    for(int num:arr){
        if(num==max){
            sum+=num;
        }
    }
    System.out.println("sum of max elements is:"+sum);
}
}




