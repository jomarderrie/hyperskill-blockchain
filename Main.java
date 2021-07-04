package blockchain;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Blockchain blockchain = new Blockchain();
        for (int i = 0; i < 5; i++) {
            blockchain.genBlockChain();
        }

    }
}
