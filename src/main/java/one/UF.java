package one;

/**
 * UnionAndFind
 * @author wusd
 */
public interface UF {
   /**
    * 判断pq是否连接
    * @param p
    * @param q
    * @return
    */
   boolean connected(int p, int q);
   void union(int p, int q);
}
