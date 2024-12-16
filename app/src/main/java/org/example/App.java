/*
 * This is my main class where all your objects are created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");
        Book book = new Book("The End of The Affair", "Graham Greene", 1951);
        System.out.println(book);
        System.out.println("");
        Patron patron = new Patron("Nii Commey", "22043189", "jnkcommey@st.ug.edu.gh");
        System.out.println(patron);

    }
}
