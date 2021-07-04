package blockchain;

import java.util.Date;

public class Block {
    private int id;
    private long timestamp;
    private String previousHash;
    private String hashBlock;
    //    private Date timeToGen;
    int magicNumber;

    public Block(int id, long timestamp, String previousHash, String hashBlock, int magicNumber) {
        this.id = id;
        this.timestamp = timestamp;
        this.previousHash = previousHash;
        this.hashBlock = hashBlock;

        this.magicNumber = magicNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Block:" +"\n"+
                "Id: " + id + "\n"+
                "Timestamp: " + timestamp + "\n"+
                "Hash of the previous block: \n" + previousHash + '\n' +
                "Hash of the block: \n" + hashBlock  + "\n"
                ;
    }
}
