package org.toby.personal.leetcode.easy;

import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;

public class ValidParentheses
{
    public boolean isValid(final String bracketCharacters)
    {
        Stack<Character> openingBracketStack = new Stack<>();
        for(final var bracketCharacter : bracketCharacters.toCharArray())
        {
            if (Bracket.isBracketCharacterOpening(bracketCharacter))
            {
                openingBracketStack.push(bracketCharacter);
            }
            else
            {
                if(Bracket.getBracketType(bracketCharacter)
                        .map(bracketType -> openingBracketStack.isEmpty() || !openingBracketStack.pop().equals(bracketType.openingBracket))
                        .orElse(true))
                {
                    return false;
                }
            }
        }
        return openingBracketStack.isEmpty();
    }

    private enum Bracket
    {
        CLOSED_BRACKET('[', ']'),
        CURLY_BRACKET('{', '}'),
        OPEN_BRACKET('(', ')');

        Bracket(Character openingBracket, Character closingBracket)
        {
            this.openingBracket = openingBracket;
            this.closingBracket = closingBracket;
        }

        private final Character openingBracket;
        private final Character closingBracket;

        public Character getOpeningBracket() {
            return openingBracket;
        }

        public Character getClosingBracket() {
            return closingBracket;
        }

        public static Optional<Bracket> getBracketType(final Character bracketCharacter)
        {
            return Arrays.stream(Bracket.values())
                    .filter(bracket -> bracket.getOpeningBracket().equals(bracketCharacter) || bracket.getClosingBracket().equals(bracketCharacter))
                    .findAny();
        }

        public static boolean isBracketCharacterOpening(final Character bracketCharacter)
        {
            return Arrays.stream(Bracket.values())
                    .map(Bracket::getOpeningBracket)
                    .anyMatch(open -> open.equals(bracketCharacter));
        }
    }
}
