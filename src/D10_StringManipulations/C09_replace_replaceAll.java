package D10_StringManipulations;

public class C09_replace_replaceAll {

    public static void main(String[] args) {

        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli

        String input= "9%J2av*(a  co_k 1*guzel";

        input=input.replaceAll("\\d",""); // Ja+va cok *guzel
        input=input.replace(" ","5"); // Ja+va5cok5*guzel
        input=input.replaceAll("\\W","");// Java5cok5guzel
        input=input.replace("_","");
        input=input.replace("5"," "); // Java cok guzel
        input=input.replaceAll("\\s+"," ");

        System.out.println(input); // Java cok guzel
    }

}
