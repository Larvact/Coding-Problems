package org.toby.personal.codility.stacksqueues;

import java.util.List;
import java.util.Stack;

public class Brackets
{
    public int isBracketStringValid(final String bracketsString)
    {
        final Stack<Character> openBracketsStack = new Stack<>();
        for(char character : bracketsString.toCharArray())
        {
            if(character == '[' || character == '{' || character == '(')
            {
                openBracketsStack.push(character);
            }
            else
            {
                if(openBracketsStack.isEmpty())
                {
                    return 0;
                }
                var lastOpenBracket = openBracketsStack.pop();
                if((character == ']' && lastOpenBracket != '[') ||
                   (character == '}' && lastOpenBracket != '{') ||
                   (character == ')' && lastOpenBracket != '('))
                {
                    return 0;
                }
            }
        }
        return openBracketsStack.isEmpty() ? 1 : 0;
    }
}
