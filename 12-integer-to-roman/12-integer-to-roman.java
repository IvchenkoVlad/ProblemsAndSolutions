class Solution {
    public String intToRoman(int num) {
        int current= 0;
        String roman = "";
        //1000
        if(num / 1000 > 0){
            current = num/1000;
            while(current>0){
                roman += "M";
                current--;
            }
            num = num % 1000;
        }
        //900
        if(num / 900 > 0){
            roman += "CM";
            num = num % 900;
        }
        //500
        if(num / 500 > 0){
            roman += "D";
            num = num % 500;
        }
        //400
        if(num / 400 > 0){
            roman += "CD";
            num = num % 400;
        }
        //100
        if(num / 100 > 0){
            current = num/100;
            while(current>0){
                roman += "C";
                current--;
            }
            num = num % 100;
        }
        //90
        if(num / 90 > 0){
            roman += "XC";
            num = num % 90;
        }
        //50
        if(num / 50 > 0){
            roman += "L";
            num = num % 50;
        }
        //40
        if(num / 40 > 0){
            roman += "XL";
            num = num % 40;
        }
        //10
        if(num / 10 > 0){
            current = num/10;
            while(current>0){
                roman += "X";
                current--;
            }
            num = num % 10;
        }
        //9
        if(num / 9 > 0){
            roman += "IX";
            num = num % 9;
        }
        //5
        if(num / 5 > 0){
            roman += "V";
            num = num % 5;
        }
        //4
        if(num / 4 > 0){
            roman += "IV";
            num = num % 4;
        }
        //1
        current = num / 1;
        while(current > 0){
            roman += "I";
            current--;
        }
        return roman;
    }
}