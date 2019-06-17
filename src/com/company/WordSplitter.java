package com.company;


public class WordSplitter {
    public static String setWordWrap(String lineToWordWrap, int lenMax){

        String returnValue = ", ";
        String lastChar = ", ";
        int indexWrap = 0;
        int i = 0;

        if (lineToWordWrap.length()>lenMax){


            for(i=0;i<lenMax;i++){


                indexWrap = lenMax-i;


                lastChar = String.valueOf(lineToWordWrap.charAt(indexWrap)) ;


                if(lastChar.equals(" ")){
                    break;
                }

            }


            if(i==lenMax){


                returnValue = lineToWordWrap.substring(0,lenMax).trim();


                returnValue = returnValue + "\r\n" + setWordWrap(lineToWordWrap.substring(lenMax).trim (), lenMax);

            }else{


                returnValue = lineToWordWrap.substring(0,indexWrap).trim();


                returnValue = returnValue + "\r\n" + setWordWrap(lineToWordWrap.substring(indexWrap). trim(), lenMax);
            }

        }else{


            returnValue = lineToWordWrap;

        }

        return returnValue;

    }
}
