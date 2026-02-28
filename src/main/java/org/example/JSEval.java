package org.example;

public class JSEval {

    public static String EvalXpath(String xpath){
        return "return document.evaluate(\"" + xpath + "\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;";
    }
}
