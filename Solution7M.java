import java.util.*;
public class Solution7M {
    public static String predictPartyVictory(String senate) {
        StringBuilder store = new StringBuilder(senate);
        int NoFR = 0, NoFD = 0, Rc = 0, Dc = 0;
        for(int i = 0;i<senate.length();i++){
            if (senate.charAt(i) !='R' && senate.charAt(i) !='D'){
                return "Invalid Scenario";
            }else{
            if (senate.charAt(i)=='R'){
                NoFR+=1;
            }else{
                NoFD+=1;
            }
        }
        }
        for (int i=0;i<99;i++) {
            
        for (int m = 0;m<senate.length();m++){
            if (senate.charAt(i)=='R' && Rc==0){
                Dc+=1;
                NoFD-=1;
                for (int j = i;j<senate.length();j++){
                    if(j+1>senate.length()){
                        for(int k = 0;k<senate.length();k++){
                        if(store.charAt(k)=='D'){
                        store.setCharAt(k, '0');
                        System.out.print(store);
                        break;}}
                    }//I GIVE UPUPUPUPUPUPU
                    if (j+1<senate.length()){
                    if (store.charAt(j+1)=='D') {
                        store.setCharAt(j+1,'0');
                        System.out.print(store);
                        break;
                    }}
            }
            if (senate.charAt(i)=='R' && Rc!=0){
                Rc-=1;
            }
            if (senate.charAt(i)=='D' && Dc==0){
                Rc+=1;
                NoFR-=1;
                for (int j = i;j<senate.length();j++){
                    if(j>senate.length()){
                        for(int k = 0;k<senate.length();k++){
                        if(store.charAt(k)=='R'){
                        store.setCharAt(k, '0');
                        System.out.print(store);
                        break;}
                    }
                    if (store.charAt(j+1)=='R') {
                        store.setCharAt(j+1,'0');
                        System.out.print(store);
                        break;
                    }}
            }
                }
            if (senate.charAt(i)=='D' && Dc!=0){
                Dc-=1;
            }
            }
        }
        System.out.println(senate);
        System.out.println(store);
        for (int l = 0;l<90;l++){
            if (senate.charAt(l)=='R' && store.charAt(l)!='0'){
                return "Radiant";
            }
            if (senate.charAt(l)=='D' && store.charAt(l)!='0'){
                return "Dire";
            }
        }
    }return "Fault in algorithm";
}
    public static void main(String[] args) {
        System.out.println("Enter string consisting of R or D");
        Scanner abc = new Scanner(System.in);
        String senate = abc.nextLine();
        System.out.println(predictPartyVictory(senate));   
    }
}



