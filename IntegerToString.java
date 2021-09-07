import java.util.*;
public class IntegerToString{
    static int revsers(int num){
        String st = Integer.toString(num);
        StringBuffer str = new StringBuffer(st);
        str.reverse();
        int number = Integer.parseInt(str.toString());
        return number;
    }

    static String decimals(int nu,String[] arr){
        String response = "";
        int n = nu;
        if(n%10==1){
            response = arr[1];
        }
        else if(n%10==2){
            response = arr[2];
        }
        else if(n%10==3){
            response = arr[3];
        }
        else if(n%10==4){
            response = arr[4];
        }
        else if(n%10==5){
            response = arr[5];
        }
        else if(n%10==6){
            response = arr[6];
        }
        else if(n%10==7){
            response = arr[7];
        }
        else if(n%10==8){
            response = arr[8];
        }
        else if(n%10==9){
            response = arr[9];
        }else if(n%10==0){
            response = arr[0];
        }
        return response;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String res = "";
        String s = Integer.toString(num);
        int len = s.length();

        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] decimal = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] place = {"Zero","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] place2 = {"Hundred","Thousand","Lac"};
        int number = 0;
        if(num==0){
            res = "Zero";
        }else if(len>6){
            res = "Sorry Number is greater then 999999";
        }
        else{
            String st = Integer.toString(num);
            StringBuffer str = new StringBuffer(st);
            str.reverse();
            number = Integer.parseInt(str.toString());
            int nums = number;
            String fires = "";
            while(nums>0){
                int rems = nums%10;
                int two_digit_ref = nums/10;
                switch(rems){
                    case 1:{
                        if(len==4){
                            fires =words[1]+place2[1];
                            res+=fires;
                            len--;
                        }else if(len==3) {
                            fires = words[1] + place2[0];
                            res += fires;
                            len--;
                        }else if(len==2 && num%10==0){
                            res+="Ten";
                            len=0;
                        }
                        else if(len==2 && revsers(nums)>10){
                            fires = decimals(revsers(nums),decimal);
                            res+=fires;
                            len = 0;
                        }else if(len==1){
                            res+=words[1];
                            len--;
                        }
                        else if(len == 5){
                            int ref = 10+two_digit_ref%10;
                            res+=decimals(ref,decimal)+place2[1];
                            nums = two_digit_ref;
                            len = len-2;
                        }
                        else if(len==6){
                            res+=words[1]+place2[2];
                            len--;
                        }

                        break;
                    }
                    case 2:{
                        if(len==4){
                            fires =words[2]+place2[1];
                            res+=fires;
                            len--;
                        }else if(len==3){
                            fires =words[2]+place2[0];
                            res+=fires;
                            len--;
                        }else if(len==2){
                            res+=place[2];
                            len--;
                        }
                        else if(len==1){
                            res+=words[2];
                            len--;
                        }else if(len == 5){
                            res+=place[2];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[2]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 3:{
                        if(len==4){
                            fires =words[3]+place2[1];
                            res+=fires;
                            len--;
                        }else if(len==3){
                            fires =words[3]+place2[0];
                            res+=fires;
                            len--;
                        }else if(len==2){
                            res+=place[3];
                            len--;
                        }else if(len==1){
                            res+=words[3];
                            len--;
                        }else if(len == 5){
                            res+=place[3];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[3]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 4:{
                        if(len==4){
                            fires =words[4]+place2[1];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==3){
                            fires =words[4]+place2[0];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==2){
                            res+=place[4];
                            len--;
                        }else if(len==1){
                            res+=words[4];
                            len--;
                        }else if(len == 5){
                            res+=place[4];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[4]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 5:{
                        if(len==4){
                            fires =words[5]+place2[1];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==3){
                            fires =words[5]+place2[0];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==2){
                            res+=place[5];
                            len--;
                        }else if(len==1){
                            res+=words[5];
                            len--;
                        }else if(len == 5){
                            res+=place[5];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[5]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 6:{
                        if(len==4){
                            fires =words[6]+place2[1];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==3){
                            fires =words[6]+place2[0];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==2){
                            res+=place[6];
                            len--;
                        }else if(len==1){
                            res+=words[6];
                            len--;
                        }else if(len == 5){
                            res+=place[6];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[6]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 7:{
                        if(len==4){
                            fires =words[7]+place2[1];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==3){
                            fires =words[7]+place2[0];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==2){
                            res+=place[7];
                            len--;
                        }else if(len==1){
                            res+=words[7];
                            len--;
                        }else if(len == 5){
                            res+=place[7];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[7]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 8:{
                        if(len==4){
                            fires =words[8]+place2[1];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==3){
                            fires =words[8]+place2[0];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==2){
                            res+=place[8];
                            len--;
                        }else if(len==1){
                            res+=words[8];
                            len--;
                        }else if(len == 5){
                            res+=place[8];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[8]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 9:{
                        if(len==4){
                            fires =words[9]+place2[1];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==3){
                            fires =words[9]+place2[0];
                            res+=fires;
                            fires="";
                            len--;
                        }else if(len==2){
                            res+=place[9];
                            len--;
                        }else if(len==1){
                            res+=words[9];
                            len--;
                        }else if(len == 5){
                            res+=place[9];
                            if(two_digit_ref%10==0){
                                res+=place2[1];
                                nums = two_digit_ref;
                                len--;
                            }
                            len--;
                        }else if(len==6){
                            res+=words[9]+place2[2];
                            len--;
                        }
                        break;
                    }
                    case 0:{ //1200 0021 1201 1021 1240 0421
                        if(len<6){
                            len--;
                        }
                        break;
                    }
                }
                res+=" ";
                nums/=10;
            }
        }

        System.out.println(res);

    }
}
