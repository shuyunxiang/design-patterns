package com.doudou.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator1 {

    // 功能提供
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

    // 构造方法私有
    private IdGenerator1() {
    }

    // 内部实例化
    private static final IdGenerator1 instance = new IdGenerator1();

    // 提供接口
    public static IdGenerator1 getInstance() {
        return instance;
    }


}

