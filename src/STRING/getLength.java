package STRING;

//Reverce a string can be done by three way
// 1) simple way is use Stingbufferclass
// 2) Converting string to chararry by help of tochararray ,using index wise we can get the the char value
//3 ) Similarly we can use str.charAt(index) and using for loop we can reverse the charecter


public class getLength {
    public void reversewihtbuffer(){
        StringBuffer buffer= new StringBuffer("Chandan");
       buffer=  buffer.reverse();
        System.out.println(buffer);
    }
    public void reversewihtchararray(){
       String ss= "Reena";
       char[] ch= ss.toCharArray();
       for (int j = ch.length-1;j >=0; j--){
           System.out.print(ch[j]);
        }
    }
    public void reversewihtcharAt(){
        String ss= "Reena";
        for (int j = ss.length()-1;j >=0; j--){
            System.out.print(ss.charAt(j));
        }
    }
    public static void main(String[] args) {
        getLength google= new getLength();
        google.reversewihtcharAt();
        String s= "chandan";
        System.out.println(s.length());
    }


}
