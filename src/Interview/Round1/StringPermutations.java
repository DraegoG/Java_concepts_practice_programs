package Interview.Round1;

public class StringPermutations {

    //intution link: https://youtu.be/GuTPwotSdYw?si=9PhZkPuxFYk0Yr4w
    public static void main(String[] args) {
        String str = "abcdef";

        //abc, acb, bac, bca, cab, cba
        perm(str.toCharArray(), 0, str.length()-1);
    }

    private static void perm(char[] str, int l, int r){
        if(l==r){
            System.out.println(str);
        }
        for(int i=l; i<=r; i++){
            swap(str, l, i);
            perm(str, l+1, r);
            swap(str, l, i);
        }
    }

    private static void swap(char[] str, int l, int r) {
        char temp = str[l];
        str[l] = str[r];
        str[r] = temp;
    }
}
