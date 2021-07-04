package blockchain;

import java.util.Date;
import java.util.HashMap;

public class Blockchain {
    private HashMap<Integer, Block> blockHashMap = new HashMap<>();
    private int id = 1;

    public Blockchain() {
    }


    public void genBlockChain() {
        Block block;
        long timeStamp = new Date().getTime();
        String utils = Utils.applySha256(id+"");
        if (blockHashMap.size() == 0) {
            block = new Block(id, timeStamp, 0+"",utils,0 );
            blockHashMap.put(id, block);
            System.out.println(block.toString());
            setId(id+1);
        }else{
            block = new Block(id,timeStamp,blockHashMap.get(id-1).getHashBlock(),utils,0);
            blockHashMap.put(id, block);
            System.out.println(block.toString());
            setId(id+1);
        }
    }

    public void validateBlockChain() {

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
}
