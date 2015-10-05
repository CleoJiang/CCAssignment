package ch10;

/**
 * Created by apple on 9/27/15.
 */
public class Solution05 {

    public static void main(String[] args) {
        String[] array = {"a","","","","b","","","c","d","e","","f"};
        System.out.println(sparseSearch(array,"b"));
        System.out.println(sparseSearch(array,"f"));
    }


    // use binary search, each time when array[mid] is "", update it with its nearest element which is not "".
    public static int sparseSearch(String[] array, String target){
        int low=0,high=array.length-1;
        if (array==null || target=="" || target==null) return -1;
        while(low<high){
            int mid=(low+high)/2;

            // when mid element is "", use itself as center to find the nearest non empty one.
            //  replace it with this non empty one.
            if (array[mid]==""){
                int before=mid-1;
                int last=mid+1;
                while(true){
                    if(before<low || last>high) return -1;
                    else if (last<=high && array[last]!=""){ mid = last; break;}
                    else if (low<=before && array[before]!=""){mid = before; break;}
                    before--;
                    last++;
                }
            }

            if (array[mid]==target) return mid;
            else if ( array[mid].compareTo(target)<0) {
                low = mid + 1;
            }
            else  high = mid - 1;
        }
        return array[low]==target?low:-1;








    }

}
