public class Valid_Palindrome_125 {
    //双指针解法,时间复杂度O(n),空间复杂度O(1).
    public boolean isPalindrome(String s) {
        int n=s.length();
        int left=0,right=n-1;
        while(left<right){
            //左边非字母数字则继续右移
            while (left<right&&!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //右边非字母数字则继续左移
            while (left<right&&!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //忽略大小写后字符不相等
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }//翻转字符串解法，时间复杂度和空间复杂度都为O(n).
    public boolean isPalindrome_1(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:s.toCharArray()){//去除非字母和数字的字符
            if(Character.isLetterOrDigit(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        //翻转字符串
        StringBuilder stringBuilder1=new StringBuilder(stringBuilder).reverse();
        return stringBuilder.toString().equals(stringBuilder1.toString());
    }
}
