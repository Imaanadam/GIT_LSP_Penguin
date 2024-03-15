package org.howard.edu.lsp.midterm.question1;


public class SecurityOps {
    /**
     * this encrypts the string by moving characters at even indexs first
     * then characters at odd indices, ignores punctuation and spaces.
     * The method is aware of the case type and keeps the case of each char.
     *
     * @param text The input string to be encrypted
     * @return The encrypted string
     */
    public static String encrypt(String text) {
        // StringBuilder for efficient string modification
        StringBuilder evenIndex = new StringBuilder();
        StringBuilder oddIndex = new StringBuilder();

        // Remove all non-alphanumeric characters
        text = text.replaceAll("[\\W_]", ""); // Underscore is also a non-word

        // Iterate over the char of the string
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                // Add characters at even index
                evenIndex.append(text.charAt(i));
            } else {
                // Add characters at odd index
                oddIndex.append(text.charAt(i));
            }
        }

        // Combine even and odd indexed characters to encrypt
        return evenIndex.toString() + oddIndex.toString();
    }
}
