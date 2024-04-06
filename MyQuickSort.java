
/*  this is my try for quick sorting */
// only half side of the array is working right now




public class MyQuickSort {
    int low ;
    int high;
    boolean mid=true;
    int midHigh;


    public void setMidHigh(int midHigh){this.midHigh = midHigh;}
    public int getMidHigh() {return midHigh;}

    public boolean getMid() {return mid;}
    public void setMid(boolean mid) {this.mid = mid;}

    public void setHigh(int high) {this.high = high;}
    public int getHigh() {return high;}

    public int getLow() {return low;}
    public void setLow(int low) {this.low = low;}

    public void printArray(int[] num){
        System.out.println();
        for(int i : num){

            System.out.print(i);
        }
    }
    public int[] swapItem(int[] num ,int a,int b){
        System.out.println();
        System.out.println("Swapping "+num[a]+"  "+num[b]);
        int temp;
        temp = num[a];
        num[a] = num[b];
        num[b] = temp;

        return num;
    }


    public void Sort(int[] num,int low ,int high,int pv){
        while(true){
            while(num[low]<num[pv]){
               low++;
           }
           System.out.println();
           System.out.println("low   "+low);

           while(num[high]> num[pv] && high!=0){
               high--;
           }

            System.out.println();
            System.out.println("high  "+high);

            if(high<=low) break;

           num=swapItem(num,low,high);
           printArray(num);
        }

        System.out.println();
        num=swapItem(num,low,pv);
        printArray(num);


        setLow(low);
        setHigh(high);
        if(getMid()){
            setMidHigh(high);
            setMid(false);
        }

        System.out.println();
        System.out.println("THIS IS THE Mid-high VALUE "+ getMidHigh());
        System.out.println("THIS IS THE LOW VALUE "+getLow());
        System.out.println("THIS IS THE high VALUE "+getHigh());

    }


    public void quickSort(){
        int[] num={6,4,3,1,7};
        printArray(num);
        Sort(num,0,num.length-2,num.length-1);
        System.out.println();

        while (high<low && low!=num.length-1) {
            Sort(num, getLow() + 1, num.length - 2, num.length - 1);
        }

        do {
            System.out.println("true");
            Sort(num, 0, getMidHigh() - 1, getMidHigh());
        } while (high >= low && low<= getMidHigh());



    }
}
