package blockchain;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many zeros the hash must start with: ");
        int amountOfInteger = scanner.nextInt();
        Blockchain blockchain = new Blockchain(amountOfInteger);
        for (int i = 0; i < 5; i++) {
            blockchain.genBlockChain();
        }

    }
}
