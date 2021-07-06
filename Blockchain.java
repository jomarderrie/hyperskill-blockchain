package blockchain;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Blockchain {
    private HashMap<Integer, Block> blockHashMap = new HashMap<>();
    private int id = 1;
    private int amountOfInteger;

    public Blockchain(int amountOfInteger) {
        this.amountOfInteger = amountOfInteger;
    }

    public void genBlockChain() throws IOException {

        long timeStamp = new Date().getTime();

        if (blockHashMap.size() == 0) {
            Block block = new Block();
//            block = new Block(id, timeStamp, 0+"",utils,amountOfInteger);
            block.setId(id);
            block.setTimestamp(timeStamp);
            block.setPreviousHash(0 + "");
            block = generateMagicNumber(block);

            blockHashMap.put(id, block);
            System.out.println(block.toString());
            addToId();
        } else {
            Block block = new Block(id, timeStamp, blockHashMap.get(id - 1).getHashBlock());
            block = generateMagicNumber(block);
            blockHashMap.put(id, block);
            System.out.println(block.toString());
            addToId();
        }
    }

    public void validateBlockChain() {

    }


    boolean looping;

    public Block generateMagicNumber(Block block) throws IOException {
        long startTime = System.currentTimeMillis();
        looping = true;
        while (looping) {
            block.setMagicNumber(ThreadLocalRandom.current().nextLong(Long.MAX_VALUE));
            String s = Utils.applySha256(block.toString());
            if (s.startsWith("0".repeat(amountOfInteger))) {
                looping = false;

                block.setTimeToGen((System.currentTimeMillis() - startTime)/1000);
                block.setHashBlock(s);
                return block;
            }
        }
        return null;
    }

    public HashMap<Integer, Block> getBlockHashMap() {
        return blockHashMap;
    }

    public void setBlockHashMap(HashMap<Integer, Block> blockHashMap) {
        this.blockHashMap = blockHashMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addToId() {
        this.id++;
    }
}
