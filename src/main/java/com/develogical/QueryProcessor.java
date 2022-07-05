package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was a " +
                    "very distyyinguished English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("name")) {
            return "Diana";
        }
        else if (query.toLowerCase().contains("numbers is the largest") ) {
            return "500";
        }
        else if (query.toLowerCase().contains("plus") ) {
            return "501";
        }



        return "";
    }
}
