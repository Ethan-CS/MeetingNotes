package io.github.ethankelly;

import java.util.*;
import java.util.regex.Pattern;

/**
 * The {@code StdIn} class provides static methods for reading strings and numbers from standard input. These functions
 * fall into one of four categories:
 * <ul>
 *      <li> Reading individual tokens from standard input, one at a time and converting each to a number, string, or
 *           boolean;
 *      <li> Reading characters from standard input, one at a time;
 *      <li> Reading lines from standard input, one at a time; and
 *      <li> Reading a sequence of values of the same type from standard input and returning the values in an array
 * </ul>
 *
 * <b> Reading tokens from standard input and converting to numbers and strings. </b>
 * We can use the following methods to read numbers, strings, and booleans from standard input one at a time:
 * <ul>
 *      <li> {@link #isEmpty()}
 *      <li> {@link #readInt()}
 *      <li> {@link #readDouble()}
 *      <li> {@link #readString()}
 *      <li> {@link #readShort()}
 *      <li> {@link #readLong()}
 *      <li> {@link #readFloat()}
 *      <li> {@link #readByte()}
 *      <li> {@link #readBoolean()}
 * </ul>
 * <p>
 * The first method returns true if standard input has no more tokens. The other methods skip over any whitespace in the
 * input. It then reads the next token and attempts to convert it into a value of the specified type. If it succeeds, it
 * returns that value; otherwise, it throws an {@link InputMismatchException}.
 *
 * <em>Whitespace</em> includes spaces, tabs, and newlines; the full definition is inherited from
 * {@link Character#isWhitespace(char)}. A <em>token</em> is a maximal sequence of non-whitespace characters. The
 * precise rules for describing which tokens can be converted to integers and floating-point numbers are inherited from
 * <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#number-syntax">Scanner</a>, using the
 * locale {@link Locale#UK}; the rules for floating-point numbers are slightly different from those in
 * {@link Double#valueOf(String)}, but unlikely to be of concern.
 * <p>
 * As an example, the following code fragment reads integers from standard input, one at a time, and prints them one per
 * line.
 * <pre>
 * while (!StdIn.isEmpty()) {
 *     double value = StdIn.readDouble();
 *     StdOut.println(value);
 * }
 * </pre>
 *
 * <b>Reading characters from standard input.</b>
 * You can use the following two methods to read characters from standard input one at a time:
 * <ul>
 *      <li> {@link #hasNextChar()}
 *      <li> {@link #readChar()}
 * </ul>
 * <p>
 * The first method returns true if standard input has more input (including whitespace). The second method reads and
 * returns the next character of input on standard input (possibly a whitespace character).
 * <p>
 * As an example, the following code fragment reads characters from standard input, one character at a time, and prints
 * it to standard output.
 * <pre>
 * while (StdIn.hasNextChar()) {
 *     char c = StdIn.readChar();
 *     StdOut.print(c);
 * }
 * </pre>
 *
 * <b>Reading lines from standard input.</b>
 * You can use the following two methods to read lines from standard input:
 * <ul>
 *      <li> {@link #hasNextLine()}
 *      <li> {@link #readLine()}
 * </ul>
 * <p>
 * The first method returns true if standard input has more input (including whitespace). The second method reads and
 * returns the remaining portion of the next line of input on standard input (possibly whitespace), discarding the
 * trailing line separator.
 * <p>
 * A <em>line separator</em> is defined to be one of the following strings:
 * {@code \n} (Linux), {@code \r} (old Macintosh),
 * {@code \r\n} (Windows),
 * {@code \}{@code u2028}, {@code \}{@code u2029}, or {@code \}{@code u0085}.
 * <p>
 * As an example, the following code fragment reads text from standard input, one line at a time, and prints it to
 * standard output.
 * <pre>
 * while (StdIn.hasNextLine()) {
 *     String line = StdIn.readLine();
 *     StdOut.println(line);
 * }
 * </pre>
 *
 * <b>Reading a sequence of values of the same type from standard input.</b>
 * You can use the following methods to read a sequence numbers, strings, or booleans (all of the same type) from
 * standard input:
 * <ul>
 *      <li> {@link #readAllDoubles()}
 *      <li> {@link #readAllInts()}
 *      <li> {@link #readAllLongs()}
 *      <li> {@link #readAllStrings()}
 *      <li> {@link #readAllLines()}
 *      <li> {@link #readAll()}
 * </ul>
 * <p>
 * The first three methods read of all of remaining token on standard input and converts the tokens to values of the
 * specified type, as in the corresponding {@code readDouble}, {@code readInt}, and {@code readString()} methods. The
 * {@code readAllLines()} method reads all remaining lines on standard input and returns them as an array of strings.
 * The {@code readAll()} method reads all remaining input on standard input and returns it as a string.
 * <p>
 * As an example, the following code fragment reads all of the remaining tokens from standard input and returns them as
 * an array of strings.
 * <pre>
 * String[] words = StdIn.readAllStrings();
 * </pre>
 *
 * <b>Differences with Scanner.</b>
 * {@code StdIn} and {@link Scanner} are both designed to parse tokens and convert them to primitive types and strings.
 * The main differences are summarized below:
 * <ul>
 *      <li> {@code StdIn} is a set of static methods and reads reads input from only standard input. It is suitable for
 *      use before a programmer knows about objects.
 *      <li> {@code StdIn} uses whitespace as the delimiter pattern that separates tokens. {@link Scanner} supports
 *      arbitrary delimiter patterns.
 *      <li> {@code StdIn} coerces the character-set encoding to UTF-8, which is the most widely used character encoding
 *      for Unicode.
 *      <li> {@code StdIn} coerces the locale to {@link Locale#UK}, for consistency with {@link StdOut},
 *      {@link Double#parseDouble(String)} and floating-point literals.
 *      <li> {@code StdIn} has convenient methods for reading a single character; reading in sequences of integers,
 *      doubles, or strings; and reading in all of the remaining input.
 * </ul>
 *
 * <b>Using standard input.</b>
 * Standard input is a fundamental operating system abstraction. The methods in {@code StdIn} are <em>blocking</em>,
 * meaning they will wait until the user enters an input on standard input. If the program has a loop that repeats until
 * the standard input is empty, the user must signal that the input is finished. To do this, depending on your operating
 * system and IDE, use either {@code <Ctrl/Cmd+d>} or {@code <Ctrl/Cmd+z>} on its own line. If we want to redirect the
 * standard input from a file, we won't need to do anything to signal that the input is finished.
 *
 * @author <a href="mailto:e.kelly.1@research.gla.ac.uk">Ethan Kelly</a>
 */
public final class StdIn {
    // Unicode UTF-8 encoding
    private static final String CHARSET_NAME = "UTF-8";
    // Language = English UK
    private static final Locale LOCALE = Locale.UK;
    // The default token separator; we maintain the invariant that this value
    // is held by the scanner's delimiter between calls
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");
    // Makes whitespace significant
    private static final Pattern EMPTY_PATTERN = Pattern.compile("");
    // Used to read the entire input
    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");
    // Scanner object
    private static Scanner scanner;

    // Doesn't make sense to instantiate this class
    private StdIn() {
    }

    /**
     * Returns true if standard input is empty (except for whitespace). Use this method to know whether the next call to
     * {@link #readString()}, {@link #readDouble()}, and so on will succeed.
     *
     * @return {@code true} if standard input is empty (except possibly for whitespace); {@code false} otherwise.
     */
    public static boolean isEmpty() {
        return !scanner.hasNext();
    }

    /**
     * Returns true if standard input has a next line. We use this method to know whether the next call to {@link
     * #readLine()} will succeed. This method is functionally equivalent to {@link #hasNextChar()}.
     *
     * @return {@code true} if standard input has more input (including whitespace); {@code false} otherwise.
     */
    public static boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    /**
     * Returns true if standard input has more input (including whitespace). Use this method to know whether the next
     * call to {@link #readChar()} will succeed. This method is functionally equivalent to {@link #hasNextLine()}.
     *
     * @return {@code true} if standard input has more input (including whitespace); {@code false} otherwise.
     */
    public static boolean hasNextChar() {
        scanner.useDelimiter(EMPTY_PATTERN);
        boolean result = scanner.hasNext();
        scanner.useDelimiter(WHITESPACE_PATTERN);
        return result;
    }

    /**
     * Reads and returns the next line, excluding the line separator if present.
     *
     * @return the next line, excluding the line separator if present; {@code null} if no such line.
     */
    public static String readLine() {
        String line;
        try {
            line = scanner.nextLine();
        } catch (NoSuchElementException e) {
            line = null;
        }
        return line;
    }

    /**
     * Reads and returns the next character.
     *
     * @return the next {@code char}.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static char readChar() throws NoSuchElementException {
        try {
            scanner.useDelimiter(EMPTY_PATTERN);
            String ch = scanner.next();
            assert ch.length() == 1 : "Internal (Std)In.readChar() error!"
                    + " Please contact the author.";
            scanner.useDelimiter(WHITESPACE_PATTERN);
            return ch.charAt(0);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Attempts to read a 'char' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads and returns the remainder of the input as a string.
     *
     * @return the remainder of the input as a string.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static String readAll() throws NoSuchElementException {
        if (!scanner.hasNextLine())
            return "";
        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
        // Not that important to reset delimiter, since now scanner is empty
        scanner.useDelimiter(WHITESPACE_PATTERN); // but let's do it anyway
        return result;
    }

    /**
     * Reads the next token and returns the {@code String}.
     *
     * @return the next {@code String}.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static String readString() throws NoSuchElementException {
        try {
            return scanner.next();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'String' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as an integer and returns the integer.
     *
     * @return the next integer on standard input.
     * @throws InputMismatchException if the next token cannot be parsed as an {@code int}.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static int readInt() throws InputMismatchException, NoSuchElementException {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read an 'int' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read an 'int' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a double and returns the double.
     *
     * @return the next double on standard input.
     * @throws InputMismatchException if the next token cannot be parsed as a {@code double}.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static double readDouble() throws InputMismatchException, NoSuchElementException {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'double' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'double' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a float and returns the float.
     *
     * @return the next float on standard input.
     * @throws InputMismatchException if the next token cannot be parsed as a {@code float}.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static float readFloat() throws InputMismatchException, NoSuchElementException {
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'float' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'float' value from standard input, "
                    + "but there no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a long integer and returns the long integer.
     *
     * @return the next long integer on standard input.
     * @throws InputMismatchException if the next token cannot be parsed as a {@code long}.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static long readLong() throws InputMismatchException, NoSuchElementException {
        try {
            return scanner.nextLong();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'long' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'long' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a short integer and returns the short integer.
     *
     * @return the next short integer on standard input.
     * @throws InputMismatchException if the next token cannot be parsed as a {@code short}.
     * @throws NoSuchElementException if standard input is empty.
     */
    public static short readShort() throws InputMismatchException, NoSuchElementException {
        try {
            return scanner.nextShort();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'short' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'short' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a byte, and returns the byte.
     *
     * @return the next byte on standard input.
     * @throws InputMismatchException if the next token cannot be parsed as a {@code byte}
     * @throws NoSuchElementException if standard input is empty
     */
    public static byte readByte() throws InputMismatchException, NoSuchElementException {
        try {
            return scanner.nextByte();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'byte' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'byte' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a boolean, and returns the boolean.
     *
     * @return the next boolean on standard input
     * @throws InputMismatchException if the next token cannot be parsed as a {@code boolean}: {@code true} or {@code 1}
     *                                for true, and {@code false} or {@code 0} for false, ignoring case
     * @throws NoSuchElementException if standard input is empty
     */
    public static boolean readBoolean() throws InputMismatchException, NoSuchElementException {
        try {
            String token = readString();
            if ("true".equalsIgnoreCase(token)) return true;
            if ("false".equalsIgnoreCase(token)) return false;
            if ("1".equals(token)) return true;
            if ("0".equals(token)) return false;
            throw new InputMismatchException("attempts to read a 'boolean' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'boolean' value from standard input, "
                    + "but no more tokens are available");
        }

    }

    /**
     * Reads all remaining tokens from standard input and returns them as an array of strings.
     *
     * @return all remaining tokens on standard input, as an array of strings.
     */
    public static String[] readAllStrings() {
        // we could use readAll.trim().split(), but that's not consistent
        // because trim() uses characters 0x00..0x20 as whitespace
        String[] tokens = WHITESPACE_PATTERN.split(readAll());
        if (tokens.length == 0 || tokens[0].length() > 0)
            return tokens;

        // don't include first token if it is leading whitespace
        String[] newTokens = new String[tokens.length - 1];
        System.arraycopy(tokens, 1, newTokens, 0, tokens.length - 1);
        return newTokens;
    }

    /**
     * Reads all remaining lines from standard input and returns them as an array of strings.
     *
     * @return all remaining lines on standard input, as an array of strings.
     */
    public static String[] readAllLines() {
        ArrayList<String> lines = new ArrayList<>();
        while (hasNextLine()) {
            lines.add(readLine());
        }
        return lines.toArray(new String[0]);
    }

    /**
     * Reads all remaining tokens from standard input, parses them as integers and returns them as an array of
     * integers.
     *
     * @return all remaining integers on standard input, as an array.
     * @throws InputMismatchException if any token cannot be parsed as an {@code int}.
     */
    public static int[] readAllInts() {
        String[] fields = readAllStrings();
        int[] values = new int[fields.length];
        for (int i = 0; i < fields.length; i++)
            values[i] = Integer.parseInt(fields[i]);
        return values;
    }

    /**
     * Reads all remaining tokens from standard input, parses them as longs, and returns them as an array of longs.
     *
     * @return all remaining longs on standard input, as an array.
     * @throws InputMismatchException if any token cannot be parsed as a {@code long}.
     */
    public static long[] readAllLongs() {
        String[] fields = readAllStrings();
        long[] values = new long[fields.length];
        for (int i = 0; i < fields.length; i++)
            values[i] = Long.parseLong(fields[i]);
        return values;
    }

    /**
     * Reads all remaining tokens from standard input, parses them as doubles, and returns them as an array of doubles.
     *
     * @return all remaining doubles on standard input, as an array.
     * @throws InputMismatchException if any token cannot be parsed as a {@code double}.
     */
    public static double[] readAllDoubles() {
        String[] fields = readAllStrings();
        double[] values = new double[fields.length];
        for (int i = 0; i < fields.length; i++)
            values[i] = Double.parseDouble(fields[i]);
        return values;
    }

    // Do this once when StdIn is initialized
    static {
        reSync();
    }

    /**
     * If StdIn changes, use this to reinitialize the scanner.
     */
    private static void reSync() {
        setScanner(new Scanner(new java.io.BufferedInputStream(System.in), CHARSET_NAME));
    }

    private static void setScanner(Scanner scanner) {
        StdIn.scanner = scanner;
        StdIn.scanner.useLocale(LOCALE);
    }

    /**
     * Reads all remaining tokens, parses them as integers and returns them as an array of integers.
     *
     * @return all remaining integers, as an array.
     * @throws InputMismatchException if any token cannot be parsed as an {@code int}.
     * @deprecated Replaced by {@link #readAllInts()}.
     */
    @Deprecated
    public static int[] readInts() {
        return readAllInts();
    }

    /**
     * Reads all remaining tokens, parses them as doubles and returns them as an array of doubles.
     *
     * @return all remaining doubles, as an array.
     * @throws InputMismatchException if any token cannot be parsed as a {@code double}.
     * @deprecated Replaced by {@link #readAllDoubles()}.
     */
    @Deprecated
    public static double[] readDoubles() {
        return readAllDoubles();
    }

    /**
     * Reads all remaining tokens and returns them as an array of strings.
     *
     * @return all remaining tokens, as an array of strings.
     * @deprecated Replaced by {@link #readAllStrings()}.
     */
    @Deprecated
    public static String[] readStrings() {
        return readAllStrings();
    }


    /**
     * Interactive test of basic functionality.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        StdOut.print("Type a string: ");
        String s = StdIn.readString();
        StdOut.println("Your string was: " + s);
        StdOut.println();

        StdOut.print("Type an int: ");
        int a = StdIn.readInt();
        StdOut.println("Your int was: " + a);
        StdOut.println();

        StdOut.print("Type a boolean: ");
        boolean b = StdIn.readBoolean();
        StdOut.println("Your boolean was: " + b);
        StdOut.println();

        StdOut.print("Type a double: ");
        double c = StdIn.readDouble();
        StdOut.println("Your double was: " + c);
        StdOut.println();
    }
}