package com.doudou.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    // 构造方法私有
    private IdGenerator() {}
    // 内部实例化
    private static final IdGenerator instance = new IdGenerator();
    // 提供接口
    public static IdGenerator getInstance() {
        return instance;
    }

    // 功能提供
    private AtomicLong id = new AtomicLong(0);
    public long getId() {
        return id.incrementAndGet();
    }
}

