package blockchain;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Block {
    private int id;
    private long timestamp;
    private String previousHash;
    private String hashBlock;
    private Long timeToGen;
    private long magicNumber;

    public Block() {
    }

    public Block(int id, long timestamp, String previousHash, String hashBlock, long magicNumber) {
        this.id = id;
        this.timestamp = timestamp;
        this.previousHash = previousHash;
        this.hashBlock = hashBlock;
        this.magicNumber = magicNumber;
    }

    public Block(int id, long timestamp, String previousHash) {
        this.id = id;
        this.timestamp = timestamp;
        this.previousHash = previousHash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getHashBlock() {
        return hashBlock;
    }

    public void setHashBlock(String hashBlock) {
        this.hashBlock = hashBlock;
    }


    public Long getTimeToGen() {
        return timeToGen;
    }

    public void setTimeToGen(Long timeToGen) {
        this.timeToGen = timeToGen;
    }

    public long getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(long magicNumber) {
        this.magicNumber = magicNumber;
    }


    @Override
    public String toString() {
        if (timeToGen != null) {
            return "Block:" + "\n" +
                    "Id: " + id + "\n" +
                    "Timestamp: " + timestamp + "\n" +
                    "Magic number: " + magicNumber + "\n" +
                    "Hash of the previous block: \n" + previousHash + '\n' +
                    "Hash of the block: \n" + hashBlock + "\n"+
                    "Block was generating for " + timeToGen + " seconds"
                    + "\n"
                    ;
        } else {
            return "Block:" + "\n" +
                    "Id: " + id + "\n" +
                    "Timestamp: " + timestamp + "\n" +
                    "Magic number: " + magicNumber + "\n" +
                    "Hash of the previous block: \n" + previousHash + '\n' +
                    "Hash of the block: \n" + hashBlock + "\n"+ "\n"
                    ;
        }
    }
}
