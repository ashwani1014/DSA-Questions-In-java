package Sorting;
class A1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int k=0;



            ///Enter the element acc to arr2
        int[] num = new int[arr1.length];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){

                if(arr2[i]==arr1[j]){
                    num[k]=arr1[j];
                    k++;
                }
                

            }
             
        }
        int start=k;


//insert the remaining elemnt 
         for(int i=0; i<arr1.length; i++){

            boolean found = false;

            for(int j=0; j<arr2.length; j++){

                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }

            if(!found){
                num[k] = arr1[i];
                k++;
            }
        }



        /// Then sort the Remainig Element
        for(int i=start;i<arr1.length;i++){

    for(int j=i+1;j<k;j++){

        if(num[i]>num[j]){
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
        }
    }
}

        return num;
    }
}