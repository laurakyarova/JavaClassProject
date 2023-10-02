package class12;

public class DifferentLanguages {

    String language(String country){
        if(country.equals("USA")){
            return "Hello";
        }else if(country.equals("Russia")){
            return "Privet";
        }else if(country.equals("Germany")){
            return "Hallo";
        }else if(country.equals("China")){
            return "Ni hao";
        }else{
            return "Don`t recognize the language";
        }

    }
}
