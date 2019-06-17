package com.company;


public class WordSplitter {
    public static String setWordWrap(String lineaToWordWrap, int lenMax){

        String returnValue = "";
        String ultimoCarattere = "";
        int indiceWrap = 0;
        int i = 0;

        if (lineaToWordWrap.length()>lenMax){


            for(i=0;i<lenMax;i++){


                indiceWrap = lenMax-i;


                ultimoCarattere = String.valueOf(lineaToWordWrap.charAt(indiceWrap)) ;


                if(ultimoCarattere.equals(" ")){
                    break;
                }

            }


            if(i==lenMax){


                returnValue = lineaToWordWrap.substring(0,lenMax).trim();


                returnValue = returnValue + "\r\n" + setWordWrap(lineaToWordWrap.substring(lenMax).trim (), lenMax);

            }else{


                returnValue = lineaToWordWrap.substring(0,indiceWrap).trim();


                returnValue = returnValue + "\r\n" + setWordWrap(lineaToWordWrap.substring(indiceWrap). trim(), lenMax);
            }

        }else{


            returnValue = lineaToWordWrap;

        }

        return returnValue;

    }
}
