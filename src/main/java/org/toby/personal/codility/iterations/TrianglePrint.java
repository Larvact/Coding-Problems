package org.toby.personal.codility.iterations;

public class TrianglePrint
{
    public static void printRightAngledTriangle(final long numberOfRows)
    {
        for(long rowIndex = 0; rowIndex < numberOfRows; rowIndex++)
        {
            final var rowBuilder = new StringBuilder();
            for(long colIndex = 0; colIndex <= rowIndex; colIndex++)
            {
                rowBuilder.append(" * ");
            }
            System.out.println(rowBuilder.toString().strip());
        }
    }

    public static void printDownPointedTriangle(final long numberOfRows)
    {
        for(long rowIndex = 0; rowIndex < numberOfRows; rowIndex++)
        {
            final var rowBuilder = new StringBuilder();
            final var numberOfColumns = (2 * numberOfRows) - 1;
            final var numberOfStars = (2 * numberOfRows) - (2 * (rowIndex + 1) - 1);
            final var numberOfSpaces = numberOfColumns - numberOfStars;
            for(long colIndex = 0; colIndex < numberOfSpaces/2; colIndex++)
            {
                rowBuilder.append("   ");
            }
            for(long colIndex = 0; colIndex < numberOfStars; colIndex++)
            {
                rowBuilder.append(" * ");
            }
            for(long colIndex = 0; colIndex < numberOfSpaces/2; colIndex++)
            {
                rowBuilder.append("   ");
            }
            System.out.println(rowBuilder);
        }
    }
}
