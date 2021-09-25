package com.silk.his.diagservice2.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author qianyf
 * @Date 2021-09-12
 */
public class RedisTest {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool("localhost");
        Jedis jedis = jedisPool.getResource();
        //连接本地的 Redis 服务
        //Jedis jedis = new Jedis("localhost");
        // 如果 Redis 服务设置了密码，需要下面这行，没有就不需要
        // jedis.auth("123456");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());
        jedis.set("jedis1", "jedis test 1");
        System.out.println(jedis.get("jedis1"));
        System.out.println(jedis.get("qqq"));
    }
}
