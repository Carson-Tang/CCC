package CCC;

import java.io.*;
import java.util.*;

/*
 * CCC '98 S4 - Lottery
 * Carson Tang
 */

public class CCO_98_S4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        for(int k = 0; k < q; k++){
            String s = br.readLine();
            int op = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)=='+'||s.charAt(i)=='X'||s.charAt(i)=='-'){
                    op++;
                }
            }
            for(int i = 0; i < s.length() && op>1; i++){
                int cnt = 0;
                if(s.charAt(i)=='X'){
                    int lb = i-2;
                    int rb = i+2;
                    boolean inbrackets = false;
                    for(int j = lb; j >= 0; j--,lb--){
                        if(s.charAt(j)==')') cnt++;
                        else if (s.charAt(j)=='(') cnt--;
                        if(!inbrackets && s.charAt(j)==')'){
                            inbrackets=true;
                        } else if(s.charAt(j)==' '&&!inbrackets){
                            break;
                        } else if (inbrackets && s.charAt(j+1)=='('&&s.charAt(j)!='('&&cnt==0){
                            break;
                        }
                    }
                    inbrackets=false;
                    cnt = 0;
                    for(int j = rb; j < s.length(); j++,rb++){
                        if(s.charAt(j)=='(') cnt++;
                        else if (s.charAt(j)==')') cnt--;
                        if(!inbrackets && s.charAt(j)=='('){
                            inbrackets=true;
                        } else if(s.charAt(j)==' '&&!inbrackets){
                            break;
                        } else if (inbrackets && s.charAt(j-1)==')'&&s.charAt(j)!=')'&&cnt==0){
                            break;
                        }
                    }
                    String first = s.substring(0,lb+1);
                    String sec = s.substring(lb+1,rb);
                    String third = s.substring(rb,s.length());
                    sec = "(" + sec + ")";
                    s = first + sec + third;
                    op--;
                    i++;
                }
            }
            for(int i = 0; i < s.length() && op>1; i++){
                int cnt = 0;
                if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                    int lb = i-2;
                    int rb = i+2;
                    boolean inbrackets = false;
                    for(int j = lb; j >= 0; j--,lb--){
                        if(s.charAt(j)==')') cnt++;
                        else if (s.charAt(j)=='(') cnt--;
                        if(!inbrackets && s.charAt(j)==')'){
                            inbrackets=true;
                        } else if(s.charAt(j)==' '&&!inbrackets){
                            break;
                        } else if (inbrackets && s.charAt(j+1)=='('&&s.charAt(j)!='(' && cnt==0){
                            break;
                        }
                    }
                    inbrackets=false;
                    cnt=0;
                    for(int j = rb; j < s.length(); j++,rb++){
                        if(s.charAt(j)==')') cnt++;
                        else if (s.charAt(j)=='(') cnt--;
                        if(!inbrackets && s.charAt(j)=='('){
                            inbrackets=true;
                        } else if(s.charAt(j)==' '&&!inbrackets){
                            break;
                        } else if (inbrackets && s.charAt(j-1)==')'&&s.charAt(j)!=')'&&cnt==0){
                            break;
                        }
                    }
                    String first = s.substring(0,lb+1);
                    String sec = s.substring(lb+1,rb);
                    String third = s.substring(rb,s.length());
                    sec = "(" + sec + ")";
                    s = first + sec + third;
                    op--;
                    i++;
                }
            }
            System.out.println(s);
            System.out.println();
        }

    }
}